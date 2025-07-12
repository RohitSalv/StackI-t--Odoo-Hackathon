package com.stackit.controller;

import com.stackit.entity.Notification;
import com.stackit.entity.User;
import com.stackit.service.NotificationService;
import com.stackit.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notifications")
@RequiredArgsConstructor
public class NotificationController {

    private final NotificationService notificationService;
    private final UserService userService;

    @GetMapping("/user/{userId}")
    public List<Notification> getUserNotifications(@PathVariable Long userId) {
        User user = userService.getUserById(userId);
        return notificationService.getNotificationsByUser(user);
    }
}
