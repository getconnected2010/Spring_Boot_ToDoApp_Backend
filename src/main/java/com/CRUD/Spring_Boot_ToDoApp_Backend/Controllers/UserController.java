package com.CRUD.Spring_Boot_ToDoApp_Backend.Controllers;

import com.CRUD.Spring_Boot_ToDoApp_Backend.entities.UserEntity;
import com.CRUD.Spring_Boot_ToDoApp_Backend.modals.UserModal;
import com.CRUD.Spring_Boot_ToDoApp_Backend.repositories.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/all")
    public List<UserEntity> getAllUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/user/{username}")
    public UserModal getUserByUserName(String userName){
        UserEntity userEntity = userRepository.findUserName(userName);
        UserModal userModal = new UserModal(userEntity.getUserId(), userEntity.getUserName());
        return userModal;
    }
}
