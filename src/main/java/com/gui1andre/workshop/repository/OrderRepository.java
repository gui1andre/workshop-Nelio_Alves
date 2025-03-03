package com.gui1andre.workshop.repository;

import com.gui1andre.workshop.entities.Order;
import com.gui1andre.workshop.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
