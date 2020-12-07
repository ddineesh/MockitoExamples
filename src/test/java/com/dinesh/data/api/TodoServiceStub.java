package com.dinesh.data.api;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService{

	public List<String> retrieveTodos(String user) {
		List<String> todoList = Arrays.asList("Learn AWS","Learn Spring","Learn Spring Boot");
		return todoList;
	}

	public void deleteTodo(String todo) {
		// TODO Auto-generated method stub
		
	}

}
