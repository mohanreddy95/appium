package com.amazon.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;

public class SelectProductPage extends WebDriverBaseTestPage<WebDriverTestPage> {
	@FindBy(locator="welcome.alreadyacustomersignin.btn")
	private QAFWebElement alreadyCustomerSignin;
	@FindBy (locator="amazonselectProduct.shopbycategory.menu")
	private QAFWebElement shopByCategorymenu;
	@FindBy (locator="search.sportsshoes.txt")
	private QAFWebElement searchResults;
	@FindBy(locator="amazonselectproduct.mans.menu")
	private QAFWebElement mensFashionMenu;
	@FindBy(locator="amazonselectproduct.mansfashion.menu")
	private QAFWebElement amazonFashionMenu;
	@FindBy (locator="amazonselectproduct.mans.txt")
	private QAFWebElement selectMans;
	@FindBy (locator="amazonselectproduct.Casualshirts.menu")
	private QAFWebElement casualShirts;
	@FindBy (locator="amazonselectproduct.tshort.txt")
	private QAFWebElement mansTshorts;
	@FindBy(locator="amazonselectproduct.mans.txt")
	private QAFWebElement mansMenu;
	@FindBy(locator="amazonsearchbar.pickitem.menu")
	private QAFWebElement pickItem;
	@FindBy(locator="amazonsear.selectitem.txt")
	private QAFWebElement selectitem;
	@FindBy(locator="amazonsearch.womensshoes.menu")
	private QAFWebElement selectWomenshoes;
	@FindBy(locator="amazonselectproduct.shirts.txt")
	private QAFWebElement shirts;
	@FindBy(locator="amazonsearch.result.txt")
	private QAFWebElement pickwomenShoes;
	@FindBy(locator="amazonsearchbar.search.txt")
	private QAFWebElement searchItems;
	@FindBy(locator="amazonselectproduct.footwear.txt")
	private QAFWebElement footwears;
	@FindBy(locator="amazonselectproduct.sportsshoes.txt")
	private QAFWebElement sportsShoes;
	@FindBy(locator="amazonselectproduct.watch.txt")
	private QAFWebElement watches;
	@FindBy(locator="amazonselectproduct.selectwatch.txt")
	private QAFWebElement selectWatch;
	@FindBy(locator="amazonselectproduct.selectwomens.txt")
	private QAFWebElement selectWomens;
	@FindBy(locator="amazonselectproduct.selectwomenswatch.txt")
	private QAFWebElement womensWatch;
	@FindBy(locator="amazonselectproduct.selectwatches.txt")
	private QAFWebElement selectWomensWatches;
	
	public QAFWebElement getMansMenu() {
		return mansMenu;
	}
	public QAFWebElement getPickItem() {
		return pickItem;
	}
	public QAFWebElement getSelectitem() {
		return selectitem;
	}
	public QAFWebElement getSelectWomenshoes() {
		return selectWomenshoes;
	}
	public QAFWebElement getPickwomenShoes() {
		return pickwomenShoes;
	}
	public QAFWebElement getSearchItems() {
		return searchItems;
	}
	public QAFWebElement getShopByCategorymenu() {
		return shopByCategorymenu;
	}
	public QAFWebElement getMensFashionMenu() {
		return mensFashionMenu;
	}
	public QAFWebElement getAmazonFashionMenu() {
		return amazonFashionMenu;
	}
	public QAFWebElement getAlreadyCustomerSignin() {
		return alreadyCustomerSignin;
	}
	public QAFWebElement getSelectMans() {
		return selectMans;
	}
	public QAFWebElement getSearchResults() {
		return searchResults;
	}
	public QAFWebElement getCasualShirts() {
		return casualShirts;
	}
	public QAFWebElement getMansTshorts() {
		return mansTshorts;
	}
	public QAFWebElement getShirts() {
		return shirts;
	}
	public QAFWebElement getFootwears() {
		return footwears;
	}
	public QAFWebElement getSportsShoes() {
		return sportsShoes;
	}
	public QAFWebElement getWatches() {
		return watches;
	}
	public QAFWebElement getSelectWatch() {
		return selectWatch;
	}
	public QAFWebElement getSelectWomens() {
		return selectWomens;
	}
	public QAFWebElement getWomensWatch() {
		return womensWatch;
	}
	public QAFWebElement getSelectWomensWatches() {
		return selectWomensWatches;
	}
	public void selectProduct()
	{
		new UserLoginPage().userLogin();
		getShopByCategorymenu().waitForVisible(30000);
		getShopByCategorymenu().click();
		getMensFashionMenu().waitForVisible(10000);
		getMensFashionMenu().click();
		Validator.verifyTrue(getAmazonFashionMenu().isPresent(), "user not  able to click on amazonFashion", "user  able to click on amazonFashions");
		getAmazonFashionMenu().click();
		getMansMenu().click();
		waitForPageToLoad();
		new ScrollDwonPage().scrollVertical();
		Validator.verifyTrue(getCasualShirts().isPresent(), "user not  able to click on casualShirts", "user  able to click on casualShirts");

		getCasualShirts().click();
		getShirts().click();
		Reporter.log("user is able to navigate back to home page");
		for(int i=0;i<5;i++)
		{
			driver.navigate().back();
		}
		getShopByCategorymenu().click();
		getMensFashionMenu().click();
		getAmazonFashionMenu().click();
		getMansMenu().click();
		waitForPageToLoad();
		Validator.verifyTrue(getWatches().isPresent(), "user not  able to click on watches menu", "user  able to click on watches menu");
		getWatches().click();
		Validator.verifyTrue(getSelectMans().isPresent(), "user not  able to  click on watch", "user  able to click on watch");
		getSelectWatch().click();
		Reporter.log("useer is able to navigate back to home page");
		for(int i=0;i<4;i++)
		{
			driver.navigate().back();
		}
		getShopByCategorymenu().click();
		getMensFashionMenu().click();
		getAmazonFashionMenu().click();
		getSelectWomens().click();
		Validator.verifyTrue(getWatches().isPresent(), "user not  able to click on womens watches", "user  able to click on woes watches");
		getWatches().click();
		Validator.verifyTrue(getWatches().isPresent(), "user not  able to click on select womes watches", "user  able to click on womensWatches");
		getSelectWomensWatches().click();
	}
	public void searchMensShoes(String item)  {
		
		new UserLoginPage().userLogin();
		getSearchItems().waitForVisible(3000);
		 Validator.verifyTrue(getSearchItems().isPresent(), "user not  able  to search a product ", "user is able to search a product");
		 getSearchItems().sendKeys(item);
		 getPickItem().waitForPresent(3000);
		 getPickItem().click();
		 waitForPageToLoad();
		 new ScrollDwonPage().scrollVertical();
		 Validator.verifyTrue(getSearchResults().isPresent(), "user is not able to see search item", "user is able to see the enter items");
	}
	public void searchWomensShoes(String witem)
	{
		new UserLoginPage().userLogin();
		Validator.verifyTrue(getSearchItems().isPresent(), "user not  able  to search a product ", "user is able to search a product");
		getSearchItems().sendKeys(witem);
		getSelectWomenshoes().waitForPresent(3000);
		getSelectMans().click();
		getPickwomenShoes().waitForPresent(3000);
		getPickwomenShoes().click();
		 Validator.verifyTrue(getPickwomenShoes().isPresent(), "user is not able to see search Results", "user is able to see the search results");
	}
	public void searchResults(String witem)
	{
		new UserLoginPage().userLogin();
		Validator.verifyTrue(getSearchItems().isPresent(), "user not  able  to search a product ", "user is able to search a product");
		getSearchItems().sendKeys(witem);
		getSelectWomenshoes().waitForPresent(3000);
		getSelectMans().click();
		getPickwomenShoes().waitForPresent(3000);
		getPickwomenShoes().click();
		Validator.verifyTrue(getSearchResults().isPresent(), "user is not able to see search Results", "user is able to see the search results");
	}
	@Override
	protected void openPage(PageLocator locator, Object... args) {
	}
	

}
