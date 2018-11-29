package com.vee.demo.todoservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.vee.demo.todoservice.model.ToDo;
import com.vee.demo.todoservice.service.ToDoService;

@SpringBootApplication
@EnableJpaRepositories("com.vee.demo.todoservice.repo")
@ComponentScan({"com.vee.demo.todoservice.model", "com.vee.demo.todoservice.service", "com.vee.demo.todoservice.controller"})
public class TodoServiceApplication implements CommandLineRunner{

	@Autowired
	private ToDoService todoService;
	
	public static void main(String[] args) {
		SpringApplication.run(TodoServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		if(todoService.list().isEmpty()) {
			todoService.addToDo(new ToDo("Eat"));
			todoService.addToDo(new ToDo("Sleep"));
			todoService.addToDo(new ToDo("Love"));
		}
	}
}
