package com.amazon.tests;

import org.testng.annotations.Test;

import com.amazon.pages.AddToCartPage;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class AddToCartTest {
	@Test
	public void addtoCart()
	{
		AddToCartPage addtocart=new AddToCartPage();
		addtocart.addToCart();
	}

}
