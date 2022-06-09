package com.CRUD.Spring_Boot_ToDoApp_Backend.services;

import com.CRUD.Spring_Boot_ToDoApp_Backend.entities.UserEntity;

import java.util.List;

public interface UserServiceInterface {

    List<UserEntity> findAll();

    UserEntity findUserName(String userName);
}
