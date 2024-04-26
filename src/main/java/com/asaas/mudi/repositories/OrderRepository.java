package com.asaas.mudi.repositories;

import com.asaas.mudi.model.Order;
import com.asaas.mudi.model.enums.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findAllByStatus(OrderStatus status);
}
