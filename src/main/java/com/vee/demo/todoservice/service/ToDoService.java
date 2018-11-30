package com.vee.demo.todoservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vee.demo.todoservice.model.ToDo;
import com.vee.demo.todoservice.repo.ToDoRepository;

@Service
public class ToDoService {

	@Autowired
	private ToDoRepository todoRepo;
	
	public List<ToDo> list(){
		return todoRepo.findAll();
	}
	
	public ToDo addToDo(ToDo todo) {
		return todoRepo.save(todo);
	}
	
	public void removeToDo(Long id) {
        todoRepo.deleteById(id);
    }
    
    // TODO: duplicate with addToDo perhaps different functionality in the future ?
    // if no.. remove it
    public ToDo updateToDo(ToDo toDo) {
        return todoRepo.save(toDo);
    }

}
