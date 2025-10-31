package com.learning.userservice.repository;

import com.learning.common.model.UserStatus;
import com.learning.userservice.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    
    Optional<UserEntity> findByEmail(String email);
    
    List<UserEntity> findByStatus(UserStatus status);
    
    List<UserEntity> findByNameContainingIgnoreCase(String name);
    
    @Query("SELECT u FROM UserEntity u WHERE u.createdAt BETWEEN :startDate AND :endDate")
    List<UserEntity> findUsersCreatedBetween(@Param("startDate") LocalDateTime startDate, 
                                           @Param("endDate") LocalDateTime endDate);
    
    @Query("SELECT COUNT(u) FROM UserEntity u WHERE u.status = :status")
    Long countByStatus(@Param("status") UserStatus status);
    
    @Query("SELECT u FROM UserEntity u WHERE u.updatedAt < :cutoffDate AND u.status = :status")
    List<UserEntity> findInactiveUsers(@Param("cutoffDate") LocalDateTime cutoffDate, 
                                     @Param("status") UserStatus status);
    
    boolean existsByEmail(String email);
}