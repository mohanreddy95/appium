package com.amazon.tests;

import org.testng.annotations.Test;

import com.amazon.pages.SelectProductPage;

public class SelectProductTest {
	@Test
	public void selectProdect()
	{
	SelectProductPage selectprodect=new SelectProductPage();
	selectprodect.selectProduct();
	}

}
