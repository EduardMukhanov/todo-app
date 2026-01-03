package com.eduardmukhanov.todo_app.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
@Table(name = "tasks")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private Boolean status;
    private LocalDateTime createdAt;
}
