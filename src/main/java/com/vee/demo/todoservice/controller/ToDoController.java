package com.vee.demo.todoservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vee.demo.todoservice.model.ToDo;
import com.vee.demo.todoservice.service.ToDoService;

@RestController
@RequestMapping("/todo")
public class ToDoController {

	@Autowired
	private ToDoService todoService;

	@GetMapping("/list")
	public List<ToDo> listTodo(){
		return todoService.list();
	} 
	
	@PostMapping("/add")
	public ToDo addTodo(@RequestBody ToDo todo) {
		return todoService.addToDo(todo);
	}
	
}
