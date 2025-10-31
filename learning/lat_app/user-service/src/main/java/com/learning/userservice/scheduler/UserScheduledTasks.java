package com.learning.userservice.scheduler;

import com.learning.common.model.User;
import com.learning.common.model.UserStatus;
import com.learning.userservice.service.NotificationService;
import com.learning.userservice.service.UserService;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component
public class UserScheduledTasks {

    @Autowired
    private UserService userService;

    @Autowired
    private NotificationService notificationService;

    // Runs every hour to generate user statistics
    @Scheduled(cron = "0 0 * * * *") // Every hour at minute 0
    public void generateHourlyUserStatistics() {
        System.out.println("=== Hourly User Statistics - " + LocalDateTime.now() + " ===");
        userService.generateUserStatistics();
    }

    // Runs daily at 2 AM to cleanup inactive users
    @Scheduled(cron = "0 0 2 * * *") // Daily at 2 AM
    public void dailyInactiveUserCleanup() {
        System.out.println("=== Daily Inactive User Cleanup - " + LocalDateTime.now() + " ===");
        userService.cleanupInactiveUsers();
    }

    // Runs every 30 minutes to send reminder notifications to active users
    @Scheduled(fixedRate = 1800000) // Every 30 minutes (1800000 ms)
    public void sendPeriodicReminders() {
        System.out.println("=== Sending Periodic Reminders - " + LocalDateTime.now() + " ===");
        
        List<User> activeUsers = userService.getUsersByStatus(UserStatus.ACTIVE);
        int reminderCount = 0;
        
        // Send reminder to first 5 active users (to avoid spam in demo)
        for (int i = 0; i < Math.min(5, activeUsers.size()); i++) {
            User user = activeUsers.get(i);
            String reminderMessage = "Don't forget to check out our latest features and updates!";
            notificationService.sendReminderNotification(user, reminderMessage);
            reminderCount++;
        }
        
        System.out.println("Sent " + reminderCount + " reminder notifications");
    }

    // Runs weekly on Sunday at 3 AM to generate weekly reports
    @Scheduled(cron = "0 0 3 * * SUN") // Weekly on Sunday at 3 AM
    public void generateWeeklyReport() {
        System.out.println("=== Weekly User Report - " + LocalDateTime.now() + " ===");
        
        LocalDateTime endDate = LocalDateTime.now();
        LocalDateTime startDate = endDate.minusDays(7);
        
        List<User> newUsers = userService.getUsersCreatedBetween(startDate, endDate);
        List<User> inactiveUsers = userService.getInactiveUsers(7);
        
        System.out.println("New users this week: " + newUsers.size());
        System.out.println("Users inactive for 7+ days: " + inactiveUsers.size());
        
        // Print details of new users
        if (!newUsers.isEmpty()) {
            System.out.println("New users:");
            newUsers.forEach(user -> 
                System.out.println("  - " + user.getName() + " (" + user.getEmail() + ")")
            );
        }
    }

    // Runs every 5 minutes for demo purposes - shows current user count
    @Scheduled(fixedRate = 300000) // Every 5 minutes (300000 ms)
    public void showCurrentUserCount() {
        Long totalUsers = userService.getUserCountByStatus(UserStatus.ACTIVE) +
                         userService.getUserCountByStatus(UserStatus.INACTIVE) +
                         userService.getUserCountByStatus(UserStatus.SUSPENDED);
        
        System.out.println("=== Current User Count: " + totalUsers + " - " + LocalDateTime.now() + " ===");
    }
}

// Quartz Job for more complex scheduling scenarios
@Component
public class UserMaintenanceJob implements Job {

    @Autowired
    private UserService userService;

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println("=== Executing User Maintenance Job - " + LocalDateTime.now() + " ===");
        
        try {
            // Perform maintenance tasks
            userService.generateUserStatistics();
            
            // Additional maintenance logic can be added here
            System.out.println("User maintenance job completed successfully");
            
        } catch (Exception e) {
            System.err.println("Error in user maintenance job: " + e.getMessage());
            throw new JobExecutionException(e);
        }
    }
}