package com.user.service;

import com.user.dto.UserResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    void testGetUserWithDevProfile() {
        UserResponse user = userService.getUser();
        assertEquals("dev_user", user.name());  
        assertEquals("dev@123", user.password());
        assertEquals("dev.user@gmail.com", user.email());
    }

    @Test
    void testGetDefaultAge() {
        assertEquals(23, userService.getUserDefaultAge());
    }

    @Test
    void testGetDefaultLocation() {
        assertEquals("Bengaluru", userService.getDefaultLocation());
    }
}