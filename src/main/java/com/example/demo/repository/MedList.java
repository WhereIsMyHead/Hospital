package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MedList extends JpaRepository<User, Long> {
    List<User> findById(String Id);
}
