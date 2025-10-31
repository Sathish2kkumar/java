package com.learning.userservice.service;

import com.learning.common.model.User;
import com.learning.common.model.UserStatus;
import com.learning.userservice.entity.UserEntity;
import com.learning.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private NotificationService notificationService;

    public List<User> getAllUsers() {
        return userRepository.findAll().stream()
                .map(this::convertToUser)
                .collect(Collectors.toList());
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id)
                .map(this::convertToUser);
    }

    public Optional<User> getUserByEmail(String email) {
        return userRepository.findByEmail(email)
                .map(this::convertToUser);
    }

    public List<User> getUsersByStatus(UserStatus status) {
        return userRepository.findByStatus(status).stream()
                .map(this::convertToUser)
                .collect(Collectors.toList());
    }

    public List<User> searchUsersByName(String name) {
        return userRepository.findByNameContainingIgnoreCase(name).stream()
                .map(this::convertToUser)
                .collect(Collectors.toList());
    }

    public User createUser(User user) {
        if (userRepository.existsByEmail(user.getEmail())) {
            throw new RuntimeException("User with email " + user.getEmail() + " already exists");
        }

        UserEntity entity = convertToEntity(user);
        UserEntity savedEntity = userRepository.save(entity);
        User savedUser = convertToUser(savedEntity);

        // Send welcome notification asynchronously
        notificationService.sendWelcomeNotification(savedUser);

        return savedUser;
    }

    public User updateUser(Long id, User user) {
        UserEntity existingEntity = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));

        // Check if email is being changed and if new email already exists
        if (!existingEntity.getEmail().equals(user.getEmail()) && 
            userRepository.existsByEmail(user.getEmail())) {
            throw new RuntimeException("User with email " + user.getEmail() + " already exists");
        }

        existingEntity.setName(user.getName());
        existingEntity.setEmail(user.getEmail());
        existingEntity.setPhone(user.getPhone());
        existingEntity.setStatus(user.getStatus());

        UserEntity updatedEntity = userRepository.save(existingEntity);
        return convertToUser(updatedEntity);
    }

    public User updateUserStatus(Long id, UserStatus status) {
        UserEntity entity = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));

        UserStatus oldStatus = entity.getStatus();
        entity.setStatus(status);
        UserEntity updatedEntity = userRepository.save(entity);
        User updatedUser = convertToUser(updatedEntity);

        // Send status change notification if status actually changed
        if (oldStatus != status) {
            notificationService.sendStatusChangeNotification(updatedUser, oldStatus, status);
        }

        return updatedUser;
    }

    public void deleteUser(Long id) {
        if (!userRepository.existsById(id)) {
            throw new RuntimeException("User not found with id: " + id);
        }
        userRepository.deleteById(id);
    }

    public Long getUserCountByStatus(UserStatus status) {
        return userRepository.countByStatus(status);
    }

    public List<User> getUsersCreatedBetween(LocalDateTime startDate, LocalDateTime endDate) {
        return userRepository.findUsersCreatedBetween(startDate, endDate).stream()
                .map(this::convertToUser)
                .collect(Collectors.toList());
    }

    public List<User> getInactiveUsers(int daysInactive) {
        LocalDateTime cutoffDate = LocalDateTime.now().minusDays(daysInactive);
        return userRepository.findInactiveUsers(cutoffDate, UserStatus.ACTIVE).stream()
                .map(this::convertToUser)
                .collect(Collectors.toList());
    }

    // Scheduled method to clean up inactive users
    public void cleanupInactiveUsers() {
        List<User> inactiveUsers = getInactiveUsers(90); // 90 days inactive
        for (User user : inactiveUsers) {
            updateUserStatus(user.getId(), UserStatus.INACTIVE);
        }
        System.out.println("Cleaned up " + inactiveUsers.size() + " inactive users");
    }

    // Scheduled method to send user statistics
    public void generateUserStatistics() {
        Long activeUsers = getUserCountByStatus(UserStatus.ACTIVE);
        Long inactiveUsers = getUserCountByStatus(UserStatus.INACTIVE);
        Long suspendedUsers = getUserCountByStatus(UserStatus.SUSPENDED);
        
        System.out.println("=== User Statistics ===");
        System.out.println("Active Users: " + activeUsers);
        System.out.println("Inactive Users: " + inactiveUsers);
        System.out.println("Suspended Users: " + suspendedUsers);
        System.out.println("Total Users: " + (activeUsers + inactiveUsers + suspendedUsers));
        System.out.println("=======================");
    }

    private User convertToUser(UserEntity entity) {
        User user = new User();
        user.setId(entity.getId());
        user.setName(entity.getName());
        user.setEmail(entity.getEmail());
        user.setPhone(entity.getPhone());
        user.setStatus(entity.getStatus());
        user.setCreatedAt(entity.getCreatedAt());
        user.setUpdatedAt(entity.getUpdatedAt());
        return user;
    }

    private UserEntity convertToEntity(User user) {
        UserEntity entity = new UserEntity();
        entity.setId(user.getId());
        entity.setName(user.getName());
        entity.setEmail(user.getEmail());
        entity.setPhone(user.getPhone());
        entity.setStatus(user.getStatus());
        if (user.getCreatedAt() != null) {
            entity.setCreatedAt(user.getCreatedAt());
        }
        if (user.getUpdatedAt() != null) {
            entity.setUpdatedAt(user.getUpdatedAt());
        }
        return entity;
    }
}