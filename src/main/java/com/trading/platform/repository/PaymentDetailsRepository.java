package com.trading.platform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trading.platform.model.PaymentDetails;

public interface PaymentDetailsRepository extends JpaRepository<PaymentDetails,Long> {

    PaymentDetails getPaymentDetailsByUserId(Long userId);
}
