package com.amazon.tests;

import org.testng.annotations.Test;

import com.amazon.pages.SelectProductPage;

public class SearchMensShoesTest  {
	
	@Test(priority=0)
	public void searchItem()
	{
	SelectProductPage selectItem=new SelectProductPage();
	String item="Shoes";
	selectItem.searchMensShoes(item);
	}
	@Test(priority=1)
	public void womensShoes()
	{
		SelectProductPage selectprodect=new SelectProductPage();
		String witem="Womens Shoes";
		selectprodect.searchWomensShoes(witem);
	}
	@Test(priority=2)
	public void searchResults()
	{
		SelectProductPage selectProdect=new SelectProductPage();
		String shoes="Womens Shoes";
		selectProdect.searchResults(shoes);
	}

}
