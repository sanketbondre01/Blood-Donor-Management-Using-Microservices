package com.example.sanket.services;

import java.util.List;

import com.example.sanket.entity.Notification;

public interface NotificationService {
    Notification sendNotification(Notification notification);
    List<Notification> getAllNotifications();
}
