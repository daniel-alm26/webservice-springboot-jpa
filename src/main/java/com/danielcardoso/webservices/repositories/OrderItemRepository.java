package com.danielcardoso.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielcardoso.webservices.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
