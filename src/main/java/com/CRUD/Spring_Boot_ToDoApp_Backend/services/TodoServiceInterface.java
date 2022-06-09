package com.CRUD.Spring_Boot_ToDoApp_Backend.services;

import com.CRUD.Spring_Boot_ToDoApp_Backend.entities.TodoEntity;

import java.util.List;

public interface TodoServiceInterface {
    List<TodoEntity> findAll();

    TodoEntity save(TodoEntity todoEntity);

    TodoEntity findById(Long id);
}
