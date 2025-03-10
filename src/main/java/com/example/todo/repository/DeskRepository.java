package com.example.todo.repository;

import com.example.todo.model.Desk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeskRepository extends JpaRepository<Desk, Long> {}
