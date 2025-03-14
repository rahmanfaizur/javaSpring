package com.user.service;


import com.user.dto.UserResponse;

import com.user.exceptions.NoUserFoundException;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Service;

@Service

public class UserService {

    @Value("${system.user.name}")
    private String name;

    @Value("${system.user.password}")
    private String password;

    @Value("${system.user.email}")
    private String email;

    public UserResponse getUser() {

    return null;
    
    }

    public int getUserDefaultAge() {

        return -1;
    }

    public String getDefaultLocation() {

        return null;
    }

}
