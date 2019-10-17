package com.amazon.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;

public class AddToCartPage extends WebDriverBaseTestPage<WebDriverTestPage> {
	@FindBy(locator="addtocart.fashions.menu")
	private QAFWebElement homeFashions;
	@FindBy(locator="addtocart.newarrivals.menu")
	private QAFWebElement newArrivalsMenu;
	@FindBy(locator="addtocart.casualshits.menu")
	private QAFWebElement casualShitsMenu;
	@FindBy(locator="addtocart.amazonbrand.txt")
	private QAFWebElement amazonBrand;
	@FindBy(locator="addtocart.size.txt")
	private QAFWebElement selectSize;
	@FindBy(locator="addtocart.clickaddtocart.btn")
	private QAFWebElement addToCartBtn;
	@FindBy(locator="addtocart.cartmenu.menu")
	private QAFWebElement cartMenu;
	@FindBy(locator="addtocart.mensformals.txt")
	private QAFWebElement mensFormals;
	@FindBy(locator="addtocart.shirtsize.txt")
	private QAFWebElement shirtSize;
	@FindBy(locator="addtocart.proceedtobuy.btn")
	private QAFWebElement proceedToBuy;
	@FindBy(locator="addtocart.formalshirts")
	private QAFWebElement formalShirts;

	public QAFWebElement getHomeFashions() {
		return homeFashions;
	}
	public QAFWebElement getNewArrivalsMenu() {
		return newArrivalsMenu;
	}
	public QAFWebElement getCasualShitsMenu() {
		return casualShitsMenu;
	}
	public QAFWebElement getAmazonBrand() {
		return amazonBrand;
	}
	public QAFWebElement getSelectSize() {
		return selectSize;
	}
	public QAFWebElement getAddToCartBtn() {
		return addToCartBtn;
	}
	public QAFWebElement getCartMenu() {
		return cartMenu;
	}

	public QAFWebElement getFormalShirts() {
		return formalShirts;
	}
	public QAFWebElement getMensFormals() {
		return mensFormals;
	}
	public QAFWebElement getShirtSize() {
		return shirtSize;
	}
	public QAFWebElement getProceedToBuy() {
		return proceedToBuy;
	}
	
	public void addToCart() {
		ScrollDwonPage scroll=new ScrollDwonPage();
		new UserLoginPage().userLogin();
		getHomeFashions().click();
		Reporter.log("clicking on home fashions options");
		getNewArrivalsMenu().waitForVisible(3000);
		getNewArrivalsMenu().click();
		getCasualShitsMenu().waitForVisible(3000);
		getCasualShitsMenu().click();
		getAmazonBrand().waitForVisible(10000);
		getAmazonBrand().click();
		scroll.performScrolling(getSelectSize());
		Reporter.log("clicking on select size options is selecting ");
		Validator.verifyTrue(getAddToCartBtn().isPresent(), "not clicking on the addtocart button ", "clicking on addtocart button");
		scroll.performScrolling(getAddToCartBtn());	
		Validator.verifyTrue(getCartMenu().isPresent(), "not clicking on cart menu  ", "clicking on cart menu");
		getCartMenu().waitForVisible(10000);
		getCartMenu().click();
		Validator.verifyTrue(getProceedToBuy().isPresent(), "user cannot able to add a product to addToCart ", "user can able to add product to cart list");
		for(int i=0;i<3;i++)
		{
			driver.navigate().back();
		}
		getCasualShitsMenu().click();
		getFormalShirts().click();
		scroll.performScrolling(getSelectSize());
		Reporter.log("clicking on size ");
		getSelectSize().click();
		scroll.performScrolling(getAddToCartBtn());
		Validator.verifyTrue(getAddToCartBtn().isPresent(), "user cannot able to add a product to addToCart ", "user can able to add product to cart list");
		getAddToCartBtn().click();
		getCartMenu().click();
		Validator.verifyTrue(getProceedToBuy().isPresent(), "user cannot able to add a product to addToCart ", "user can able to add product to cart list");
		
	}
	@Override
	protected void openPage(PageLocator locator, Object... args) {
	}
}
