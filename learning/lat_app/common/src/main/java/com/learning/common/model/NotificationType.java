package com.learning.common.model;

public enum NotificationType {
    USER_REGISTRATION("User Registration"),
    ORDER_CONFIRMATION("Order Confirmation"),
    ORDER_STATUS_UPDATE("Order Status Update"),
    PAYMENT_CONFIRMATION("Payment Confirmation"),
    SYSTEM_ALERT("System Alert"),
    PROMOTIONAL("Promotional"),
    REMINDER("Reminder");

    private final String displayName;

    NotificationType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}