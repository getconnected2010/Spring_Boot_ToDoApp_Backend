package com.CRUD.Spring_Boot_ToDoApp_Backend.Controllers;

import com.CRUD.Spring_Boot_ToDoApp_Backend.entities.TodoEntity;
import com.CRUD.Spring_Boot_ToDoApp_Backend.repositories.TodoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;

    @GetMapping("/todo/all")
    public List<TodoEntity> getAllTodo(){
        return todoRepository.findAll();
    }

    @PostMapping("/todo/add")
    public String addTodo(@RequestBody TodoEntity todoEntity){
        todoRepository.save(todoEntity);
        return "Task successfully added to the list";
    }

    @PutMapping("/todo/update/{id}")
    public String updateTodo(@RequestBody TodoEntity todoEntity, @PathVariable("id") Long Id){
        TodoEntity dbTodo = todoRepository.findById(Id).get();
        BeanUtils.copyProperties(todoEntity, dbTodo);
        todoRepository.save(dbTodo);
        return "Task updated successfully";
    }
}
