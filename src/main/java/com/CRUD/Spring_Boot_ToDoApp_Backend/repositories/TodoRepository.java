package com.CRUD.Spring_Boot_ToDoApp_Backend.repositories;

import com.CRUD.Spring_Boot_ToDoApp_Backend.entities.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, Long> {

}
