package com.example.sanket.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sanket.entity.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
