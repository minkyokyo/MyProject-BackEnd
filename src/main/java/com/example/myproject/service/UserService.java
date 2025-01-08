package com.example.myproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myproject.repository.UserRepository;
import com.example.myproject.entity.Member;
@Service
public class UserService
{
    @Autowired
    private UserRepository userRepository;

    public Member registerUser(Member user)
    {
        if(userRepository.findByMembername(user.getMembername()) !=null)
        {
            throw new IllegalArgumentException("username already exists");
        }
        return userRepository.save(user);
    }
}