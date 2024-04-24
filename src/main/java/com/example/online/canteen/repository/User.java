package com.example.online.canteen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface User extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);

}
