package com.asaas.mudi.repositories;

import com.asaas.mudi.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
