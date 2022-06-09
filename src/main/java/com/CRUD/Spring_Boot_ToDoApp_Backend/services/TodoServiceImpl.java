package com.CRUD.Spring_Boot_ToDoApp_Backend.services;

import com.CRUD.Spring_Boot_ToDoApp_Backend.entities.TodoEntity;
import com.CRUD.Spring_Boot_ToDoApp_Backend.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoServiceInterface{

    @Autowired
    TodoRepository todoRepository;

    @Override
    public List<TodoEntity> findAll() {
        return todoRepository.findAll();
    }

    @Override
    public TodoEntity save(TodoEntity todoEntity) {
        return todoRepository.save(todoEntity);
    }

    @Override
    public TodoEntity findById(Long id) {
        return todoRepository.findById();
    }
}
