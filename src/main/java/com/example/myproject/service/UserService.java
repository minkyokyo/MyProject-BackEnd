package com.example.myproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myproject.repository.UserRepository;
import com.example.myproject.entity.User;
@Service
public class UserService
{
    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user)
    {
        if(userRepository.FindByUserName(user.getUsername()) !=null)
        {
            throw new IllegalArgumentException("username already exists");
        }
        return userRepository.save(user);
    }
}