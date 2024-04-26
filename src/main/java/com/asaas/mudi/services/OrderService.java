package com.asaas.mudi.services;

import com.asaas.mudi.model.Order;

import java.util.List;

public interface OrderService {
    List<Order> findAllByStatus(String status);

    Order save(Order order);
}
