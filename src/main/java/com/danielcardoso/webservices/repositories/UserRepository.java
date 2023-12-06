package com.danielcardoso.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielcardoso.webservices.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
