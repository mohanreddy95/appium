package com.amazon.tests;

import org.testng.annotations.Test;

import com.amazon.pages.SortingPage;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class FilterTest {
	@Test
	public void filter()
	{
		SortingPage sorting=new SortingPage();
		String search="books";
		sorting.filter(search);
	}

}
