package com.gui1andre.workshop.repository;

import com.gui1andre.workshop.entities.OrderItem;
import com.gui1andre.workshop.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
