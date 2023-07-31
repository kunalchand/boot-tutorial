package com.tutorial.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorial.orderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
