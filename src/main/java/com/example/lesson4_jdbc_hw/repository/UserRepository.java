package com.example.lesson4_jdbc_hw.repository;

import com.example.lesson4_jdbc_hw.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findAllByAgeGreaterThan(Long age);
}
