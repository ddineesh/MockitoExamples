package com.dinesh.business;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.dinesh.data.api.TodoService;
import com.dinesh.data.api.TodoServiceStub;

public class TodoBusinessImplStubTest {

	@Test
	public void testRetrieveTodosRelatedToSpring_usingAStub() {
		TodoService todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl businessImpl = new TodoBusinessImpl(todoServiceStub);
		List<String> retrieveTodosRelatedToSpring = businessImpl.retrieveTodosRelatedToSpring("dinesh");
		assertEquals(2, retrieveTodosRelatedToSpring.size());
	}

	@Test
	public void testRetrieveTodosRelatedToSpring1_usingArraysEqualsStub() {
		TodoService todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl businessImpl = new TodoBusinessImpl(todoServiceStub);
		List<String> retrieveTodosRelatedToSpring = businessImpl.retrieveTodosRelatedToSpring("dinesh");
		String[] expectedTodos = { "Learn Spring", "Learn Spring Boot" };
		String[] actualTodos = new String[retrieveTodosRelatedToSpring.size()];

		for (int j = 0; j < retrieveTodosRelatedToSpring.size(); j++) {
			actualTodos[j] = retrieveTodosRelatedToSpring.get(j);
		}
		assertArrayEquals(expectedTodos, actualTodos);
	}

}
