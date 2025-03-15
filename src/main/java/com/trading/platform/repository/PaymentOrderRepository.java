package com.trading.platform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trading.platform.model.PaymentOrder;

public interface PaymentOrderRepository extends JpaRepository<PaymentOrder,Long> {
}
