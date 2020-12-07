package com.dinesh.business;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.dinesh.data.api.TodoService;
import com.dinesh.data.api.TodoServiceStub;

public class TodoBusinessImplStubMockTest {

	@Test
	public void testRetrieveTodosRelatedToSpring_usingAMock() {
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> todoList = Arrays.asList("Learn AWS","Learn Spring","Learn Spring Boot");
		when(todoServiceMock.retrieveTodos("dinesh")).thenReturn(todoList);
		TodoBusinessImpl businessImpl = new TodoBusinessImpl(todoServiceMock);
		List<String> retrieveTodosRelatedToSpring = businessImpl.retrieveTodosRelatedToSpring("dinesh");
		assertEquals(2, retrieveTodosRelatedToSpring.size());
	}

	@Test
	public void testRetrieveTodosRelatedToSpring_usingArraysEqualsMock() {
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> todoList = Arrays.asList("Learn AWS","Learn Spring","Learn Spring Boot");
		when(todoServiceMock.retrieveTodos("dinesh")).thenReturn(todoList);
		TodoBusinessImpl businessImpl = new TodoBusinessImpl(todoServiceMock);
		List<String> retrieveTodosRelatedToSpring = businessImpl.retrieveTodosRelatedToSpring("dinesh");
		String[] expectedTodos = { "Learn Spring", "Learn Spring Boot" };
		String[] actualTodos = new String[retrieveTodosRelatedToSpring.size()];

		for (int j = 0; j < retrieveTodosRelatedToSpring.size(); j++) {
			actualTodos[j] = retrieveTodosRelatedToSpring.get(j);
		}
		assertArrayEquals(expectedTodos, actualTodos);
	}

}
