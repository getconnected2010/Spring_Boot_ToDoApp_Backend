package com.CRUD.Spring_Boot_ToDoApp_Backend.services;

import com.CRUD.Spring_Boot_ToDoApp_Backend.entities.UserEntity;
import com.CRUD.Spring_Boot_ToDoApp_Backend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserServiceInterface{

    @Autowired
    UserRepository userRepository;

    @Override
    public List<UserEntity> findAll() {
        return userRepository.findAll();
    }

    @Override
    public UserEntity findUserName(String userName) {
        return userRepository.findUserName(userName);
    }
}
