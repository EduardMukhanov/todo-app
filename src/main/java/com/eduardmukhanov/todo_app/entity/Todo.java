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

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Boolean getStatus() {
        return status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
