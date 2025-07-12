package com.stackit.service;

import com.stackit.dao.NotificationDao;
import com.stackit.entity.Notification;
import com.stackit.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NotificationServiceImpl implements NotificationService {

    private final NotificationDao notificationDao;

    @Override
    public Notification createNotification(Notification notification) {
        return notificationDao.save(notification);
    }

    @Override
    public List<Notification> getNotificationsByUser(User user) {
        return notificationDao.findByUserOrderByCreatedAtDesc(user);
    }
}
