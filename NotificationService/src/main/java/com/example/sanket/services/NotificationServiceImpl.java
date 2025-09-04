package com.example.sanket.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.example.sanket.Feign.NotificationServiceFeign;
import com.example.sanket.entity.Notification;
import com.example.sanket.entity.RequestBlood;
import com.example.sanket.repo.NotificationRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class NotificationServiceImpl implements NotificationService {

    private final NotificationRepository notificationRepository;
    private final NotificationServiceFeign notificationServiceFeign; 

    @Override
    public Notification sendNotification(Notification notification) {
        
        RequestBlood requestBlood = notificationServiceFeign.getRequestStatus(notification.getRequestId());

        
        notification.setMessage("Request ID " + requestBlood.getId() +
                                " is currently " + requestBlood.getStatus());
        notification.setSentAt(LocalDateTime.now());

        return notificationRepository.save(notification);
    }

    @Override
    public List<Notification> getAllNotifications() {
        return notificationRepository.findAll();
    }
}
