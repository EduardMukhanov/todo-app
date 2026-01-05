package com.eduardmukhanov.todo_app.service;

import com.eduardmukhanov.todo_app.entity.Todo;
import com.eduardmukhanov.todo_app.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    private final TodoRepository todoRepository;

    public List<Todo> findAll(){
        return todoRepository.findAll();
    }

    public Todo findById(Integer id){
         return todoRepository.findById(id)
                 .orElseThrow(() -> new RuntimeException("todo with id " + id + " not found")
                 );
    }

    public Todo save(Todo todo){
        return todoRepository.save(todo);
    }

    public void delete(Integer id){
        if (!todoRepository.existsById(id)){
            throw new RuntimeException("todo with id " + id + " not found");
        }
        todoRepository.deleteById(id);
    }

    public void deleteAllTasks(){
        todoRepository.deleteAll();
    }
}
