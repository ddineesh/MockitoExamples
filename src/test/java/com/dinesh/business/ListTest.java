package com.dinesh.business;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class ListTest {

	@Test
	public void Listtest_UsingMock() {
		
		List listMock=mock(List.class);
		when(listMock.size()).thenReturn(2);
		assertEquals(2, listMock.size());
	}
	
	@Test
	public void ListtestMultipleReturns_UsingMock() {
		
		List listMock=mock(List.class);
		when(listMock.size()).thenReturn(2).thenReturn(3);
		assertEquals(2, listMock.size());
		assertEquals(3, listMock.size());
	}

	@Test
	public void ListGetTest_UsingMock() {
		
		List listMock=mock(List.class);
		when(listMock.get(0)).thenReturn("dinesh");
		assertEquals("dinesh", listMock.get(0));
		//The below code is nice mock which will return default value
		assertEquals(null, listMock.get(1));
	}
	
	@Test
	public void ListGetTest_UsingMockArgumentMatcher() {
		
		List listMock=mock(List.class);
		//The below code is argument matcher in mock which will work any integer arugment

		when(listMock.get(anyInt())).thenReturn("dinesh");
		assertEquals("dinesh", listMock.get(0));
		assertEquals("dinesh", listMock.get(1));
	}
	
}
