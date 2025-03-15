package com.trading.platform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trading.platform.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
