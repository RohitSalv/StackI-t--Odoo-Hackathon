package com.stackit.service;

import com.stackit.entity.Notification;
import com.stackit.entity.User;
import java.util.List;

public interface NotificationService {
    Notification createNotification(Notification notification);
    List<Notification> getNotificationsByUser(User user);
}
