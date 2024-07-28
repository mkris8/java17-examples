package com.examples.enhancedswitch;

enum NOTIFICATION{
    EMAIL,
    SMS,
    PUSH,
    UNKNOWN;
}

public class NotificationHandler {
    public static void main(String[] args) {
        String notificationType = switch (NOTIFICATION.EMAIL) {
            case SMS -> "send an SMS notification";
            case EMAIL -> "send an EMAIL notification";
            case PUSH -> "send a push notification";
            default -> throw new IllegalArgumentException("Invalid notification");
        };
        System.out.println("notificationType is: "+ notificationType);
    }
}
