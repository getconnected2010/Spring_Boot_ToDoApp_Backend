package com.CRUD.Spring_Boot_ToDoApp_Backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories("com.CRUD.Spring_Boot_ToDoApp_Backend")
//@EntityScan({"com.CRUD.Spring_Boot_ToDoApp_Backend"})
//@ComponentScan(basePackages = "com.CRUD.Spring_Boot_ToDoApp_Backend")
public class SpringBootToDoAppBackendApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootToDoAppBackendApplication.class, args);
	}

}
