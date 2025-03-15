package com.trading.platform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trading.platform.model.VerificationCode;

public interface VerificationRepository extends JpaRepository<VerificationCode,Long> {
    VerificationCode findByUserId(Long userId);
}
