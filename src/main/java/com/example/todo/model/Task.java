package com.example.todo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "title", nullable = false)
    String title;

    @Column(name = "description")
    String description;

    @Column(name = "is_completed")
    boolean isCompleted;

    @ManyToOne
    @JoinColumn(name = "task_list_id")
    @JsonBackReference
    TaskList taskList;
}
