package com.android.tests;

import org.testng.annotations.Test;

import com.android.pages.SortingPage;

public class SortingTest {
	@Test
	public void sorting()
	{
		SortingPage sort=new SortingPage();
		String productname="books";
		sort.sorting(productname);
	}

}
