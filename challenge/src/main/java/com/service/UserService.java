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

    @Value("${user.profile.default-age}")
    private int defaultAge;

    @Value("${user.profile.default-location:Bengaluru}")
    private String defaultLocation;

    public UserResponse getUser() {
        if (name == null || password == null || email == null) {
            throw new NoUserFoundException("User details not found");
        }
        return new UserResponse(name, password, email); // field names match record parameters
    }

    public int getUserDefaultAge() {
        return defaultAge;
    }

    public String getDefaultLocation() {
        return defaultLocation;
    }
}
