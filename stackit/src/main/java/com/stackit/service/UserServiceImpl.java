package com.stackit.service;

import com.stackit.dao.UserDao;
import com.stackit.entity.User;
import com.stackit.exception.ResourceNotFoundException;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Override
    public User createUser(User user) {
        return userDao.save(user);
    }

    @Override
    public User getUserById(Long id) {
        return userDao.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));

    }

    @Override
    public List<User> getAllUsers() {
        return userDao.findAll();
    }
}
