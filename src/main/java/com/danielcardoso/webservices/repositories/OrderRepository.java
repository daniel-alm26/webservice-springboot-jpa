package com.danielcardoso.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielcardoso.webservices.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
