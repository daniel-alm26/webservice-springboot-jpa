package com.danielcardoso.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielcardoso.webservices.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
