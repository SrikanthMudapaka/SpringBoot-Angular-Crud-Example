package com.example.mini.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mini.model.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {
    List<User> findByEmail(String email);
}
