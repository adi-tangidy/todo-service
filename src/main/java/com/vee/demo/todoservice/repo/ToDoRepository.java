package com.vee.demo.todoservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vee.demo.todoservice.model.ToDo;

public interface ToDoRepository extends JpaRepository<ToDo, Long>{

}
