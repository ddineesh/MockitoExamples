package com.dinesh.business;

import java.util.ArrayList;
import java.util.List;

//TodoBusinessImpl- SUT ( System Under Test)
//TodoService - dependency

import com.dinesh.data.api.TodoService;

public class TodoBusinessImpl {

	private TodoService todoService;

	public TodoBusinessImpl(TodoService todoService) {
		super();
		this.todoService = todoService;
	}

	public List<String> retrieveTodosRelatedToSpring(String user) {
		List<String> filteredTodos = new ArrayList<String>();
		List<String> todos = todoService.retrieveTodos(user);
		for (String todo : todos) {
			if (todo.contains("Spring")) {
				filteredTodos.add(todo);
			}
		}
		return filteredTodos;
	}

	public void deleteTodosNotRelatedToSpring(String user) {
		List<String> allTodos = todoService.retrieveTodos(user);
		for (String todo : allTodos) {
			if (!todo.contains("Spring")) {
				todoService.deleteTodo(todo);
			}
		}
	}
	
}
