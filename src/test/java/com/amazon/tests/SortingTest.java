package com.amazon.tests;

import org.testng.annotations.Test;

import com.amazon.pages.SortingPage;

public class SortingTest {
	@Test
	public void sorting()
	{
		SortingPage sort=new SortingPage();
		String productname="books";
		sort.sorting(productname);
	}

}
