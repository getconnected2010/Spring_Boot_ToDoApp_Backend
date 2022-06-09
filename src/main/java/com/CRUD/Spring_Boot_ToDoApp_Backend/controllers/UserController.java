package com.CRUD.Spring_Boot_ToDoApp_Backend.controllers;

import com.CRUD.Spring_Boot_ToDoApp_Backend.entities.UserEntity;
import com.CRUD.Spring_Boot_ToDoApp_Backend.modals.UserModal;
import com.CRUD.Spring_Boot_ToDoApp_Backend.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @GetMapping("/user/all")
    public List<UserEntity> getAllUsers(){
        return userService.findAll();
    }

    @GetMapping("/user/{username}")
    public UserModal getUserByUserName(String userName){
        UserEntity userEntity = userService.findUserName(userName);
        UserModal userModal = new UserModal(userEntity.getUserId(), userEntity.getUserName());
        return userModal;
    }
}
