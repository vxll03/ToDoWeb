package com.example.todo.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "desk")
public class Desk {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "desk_name", nullable = false)
    String deskName;


    @OneToMany(mappedBy = "desk", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonManagedReference
    List<TaskList> taskLists;

}
