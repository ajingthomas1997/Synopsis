package com.trading.platform.service;

import java.util.List;

import com.trading.platform.domain.OrderType;
import com.trading.platform.model.Coin;
import com.trading.platform.model.Order;
import com.trading.platform.model.OrderItem;
import com.trading.platform.model.User;
import com.trading.platform.request.CreateOrderRequest;

public interface OrderService {

    Order createOrder(User user, OrderItem orderItem, OrderType orderType);

    Order getOrderById(Long orderId);

    List<Order> getAllOrdersForUser(Long userId, String orderType,String assetSymbol);

    void cancelOrder(Long orderId);

//    Order buyAsset(CreateOrderRequest req, Long userId, String jwt) throws Exception;

    Order processOrder(Coin coin, double quantity, OrderType orderType, User user) throws Exception;

//    Order sellAsset(CreateOrderRequest req,Long userId,String jwt) throws Exception;


}
