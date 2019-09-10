package com.android.tests;

import org.testng.annotations.Test;


import com.android.pages.SelectProductPage;

public class SelectProductTest {
	@Test
	public void selectProdect()
	{
	SelectProductPage selectprodect=new SelectProductPage();
	selectprodect.selectProduct();
	}

}
