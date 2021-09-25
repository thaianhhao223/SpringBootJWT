package com.example.spring_boot_jwt_tah.service;

import com.example.spring_boot_jwt_tah.authen.UserPrincipal;
import com.example.spring_boot_jwt_tah.entity.User;

public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}
