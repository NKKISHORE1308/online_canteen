package com.example.online.canteen.repository;

import com.example.online.canteen.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<UserRepository, Integer> {
    static void save(User user) {
    }

}
