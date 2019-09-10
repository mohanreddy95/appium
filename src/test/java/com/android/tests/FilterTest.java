package com.android.tests;

import org.testng.annotations.Test;

import com.android.pages.SortingPage;
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
