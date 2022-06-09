package com.CRUD.Spring_Boot_ToDoApp_Backend.repositories;

import com.CRUD.Spring_Boot_ToDoApp_Backend.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserEntity findUserName(String userName);
}

