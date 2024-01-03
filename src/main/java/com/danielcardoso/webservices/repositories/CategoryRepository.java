package com.danielcardoso.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielcardoso.webservices.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
