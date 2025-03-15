package com.trading.platform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trading.platform.model.Order;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Long> {

    public List<Order>findByUserId(Long userId);
}
