package com.asaas.mudi.services.impl;

import com.asaas.mudi.model.Order;
import com.asaas.mudi.model.enums.OrderStatus;
import com.asaas.mudi.repositories.OrderRepository;
import com.asaas.mudi.services.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<Order> findAllByStatus(String status) {
        if(status.equals("all")){
            return orderRepository.findAll();
        }
        return orderRepository.findAllByStatus(OrderStatus.valueOf(status));
    }

    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }
}
