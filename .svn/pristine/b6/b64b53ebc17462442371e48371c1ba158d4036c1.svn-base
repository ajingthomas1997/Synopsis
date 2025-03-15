package com.trading.platform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trading.platform.domain.WithdrawalStatus;
import com.trading.platform.model.Withdrawal;

import java.util.List;

public interface WithdrawalRepository extends JpaRepository<Withdrawal,Long> {
    List<Withdrawal> findByUserId(Long userId);
}
