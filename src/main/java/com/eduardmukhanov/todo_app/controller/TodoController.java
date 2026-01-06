package com.eduardmukhanov.todo_app.controller;

import com.eduardmukhanov.todo_app.entity.Todo;
import com.eduardmukhanov.todo_app.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {
    private final TodoService todoService;
    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public List<Todo> getAllTasks(){
        return todoService.findAll();
    }

    @GetMapping("/{id}")
    public Todo getTaskById(@PathVariable Integer id){
        return todoService.findById(id);
    }

    @PostMapping
    public Todo saveTask(@RequestBody Todo todo){
        return todoService.save(todo);
    }

    @PutMapping("/{id}")
    public Todo updateTaskById(@PathVariable Integer id, @RequestBody Todo todo){
        return todoService.updateExistingTaskById(id, todo);
    }

    @DeleteMapping("/{id}")
    public void deleteTaskById(@PathVariable Integer id){
        todoService.delete(id);
    }

    @DeleteMapping()
    public void clear(){
        todoService.deleteAllTasks();
    }

}
