package com.CRUD.Spring_Boot_ToDoApp_Backend.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class TodoController {

    @GetMapping("/todo/all")
    public String getAllTodo(){

        return "Hello";
    }

//    @Autowired
//    private TodoServiceImpl todoService;
//
//    @GetMapping("/todo/all")
//    public List<TodoEntity> getAllTodo(){
//
//        return todoService.findAll();
//    }
//
//    @PostMapping("/todo/add")
//    public String addTodo(@RequestBody TodoEntity todoEntity){
//        todoService.save(todoEntity);
//        return "Task successfully added to the list";
//    }
//
//    @PutMapping("/todo/update/{id}")
//    public String updateTodo(@RequestBody TodoEntity todoEntity, @PathVariable("id") Long Id){
//        TodoEntity dbTodo = todoService.findById(Id);
//        BeanUtils.copyProperties(todoEntity, dbTodo);
//        todoService.save(dbTodo);
//        return "Task updated successfully";
//    }
}
