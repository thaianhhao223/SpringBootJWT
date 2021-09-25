package com.example.spring_boot_jwt_tah.repository;

import com.example.spring_boot_jwt_tah.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository  extends JpaRepository<Token, Long> {
    Token findByToken(String token);
}
