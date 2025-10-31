package com.learning.userservice.service;

import com.learning.common.model.Notification;
import com.learning.common.model.NotificationType;
import com.learning.common.model.User;
import com.learning.common.model.UserStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class NotificationService {

    @Autowired
    private WebClient.Builder webClientBuilder;

    @Async
    public void sendWelcomeNotification(User user) {
        try {
            Notification notification = new Notification(
                user.getId(),
                NotificationType.USER_REGISTRATION,
                "Welcome to Our Platform!",
                "Hello " + user.getName() + ", welcome to our platform! We're excited to have you on board."
            );

            // Send to notification service via HTTP
            webClientBuilder.build()
                .post()
                .uri("http://notification-service/api/notifications")
                .bodyValue(notification)
                .retrieve()
                .bodyToMono(String.class)
                .subscribe(
                    response -> System.out.println("Welcome notification sent for user: " + user.getEmail()),
                    error -> System.err.println("Failed to send welcome notification: " + error.getMessage())
                );
        } catch (Exception e) {
            System.err.println("Error sending welcome notification: " + e.getMessage());
        }
    }

    @Async
    public void sendStatusChangeNotification(User user, UserStatus oldStatus, UserStatus newStatus) {
        try {
            String message = String.format(
                "Hello %s, your account status has been changed from %s to %s.",
                user.getName(), oldStatus.getDisplayName(), newStatus.getDisplayName()
            );

            Notification notification = new Notification(
                user.getId(),
                NotificationType.SYSTEM_ALERT,
                "Account Status Changed",
                message
            );

            // Send to notification service via HTTP
            webClientBuilder.build()
                .post()
                .uri("http://notification-service/api/notifications")
                .bodyValue(notification)
                .retrieve()
                .bodyToMono(String.class)
                .subscribe(
                    response -> System.out.println("Status change notification sent for user: " + user.getEmail()),
                    error -> System.err.println("Failed to send status change notification: " + error.getMessage())
                );
        } catch (Exception e) {
            System.err.println("Error sending status change notification: " + e.getMessage());
        }
    }

    @Async
    public void sendReminderNotification(User user, String reminderMessage) {
        try {
            Notification notification = new Notification(
                user.getId(),
                NotificationType.REMINDER,
                "Reminder",
                reminderMessage
            );

            // Send to notification service via HTTP
            webClientBuilder.build()
                .post()
                .uri("http://notification-service/api/notifications")
                .bodyValue(notification)
                .retrieve()
                .bodyToMono(String.class)
                .subscribe(
                    response -> System.out.println("Reminder notification sent for user: " + user.getEmail()),
                    error -> System.err.println("Failed to send reminder notification: " + error.getMessage())
                );
        } catch (Exception e) {
            System.err.println("Error sending reminder notification: " + e.getMessage());
        }
    }
}