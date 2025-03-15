package com.trading.platform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trading.platform.model.ForgotPasswordToken;

public interface ForgotPasswordRepository extends JpaRepository<ForgotPasswordToken,String> {
    ForgotPasswordToken findByUserId(Long userId);
}
