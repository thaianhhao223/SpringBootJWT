package com.example.spring_boot_jwt_tah.service;


import com.example.spring_boot_jwt_tah.entity.Token;

public interface TokenService {
    Token createToken(Token token);

    Token findByToken(String token);
}
