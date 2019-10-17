package com.amazon.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;

public class SortingPage extends WebDriverBaseTestPage<WebDriverTestPage> {
	@FindBy(locator="sorting.Filter.dropdown")
	private QAFWebElement filterOption;
	@FindBy(locator="sorting.sortBy.btn")
	private QAFWebElement sortingMenu;
	@FindBy(locator="sorting.priceLowToHigh.btn")
	private QAFWebElement priceLowToHigh;
	@FindBy(locator="sorting.books.txt")
	private QAFWebElement BooksOptions;
	@FindBy(locator="sorting.results.txt")
	private QAFWebElement searchResults;
	@FindBy(locator="filter.filter.menu")
	private QAFWebElement filterOptions;
	@FindBy(locator="filter.format.txt")
	private QAFWebElement formatOption;
	@FindBy(locator="filter.paperbock.txt")
	private QAFWebElement paperbockOption;
	public QAFWebElement getSearchResults() {
		return searchResults;
	}
	public QAFWebElement getFilterOption() {
		return filterOption;
	}
	public QAFWebElement getSortingMenu() {
		return sortingMenu;
	}
	public QAFWebElement getPriceLowToHigh() {
		return priceLowToHigh;
	}
	public QAFWebElement getBooksOptions() {
		return BooksOptions;
	}
	public QAFWebElement getFilterOptions() {
		return filterOptions;
	}
	public QAFWebElement getFormatOption() {
		return formatOption;
	}
	public QAFWebElement getPaperbockOption() {
		return paperbockOption;
	}
	public void sorting(String productName) {
	     
		new UserLoginPage().userLogin();
		Validator.verifyTrue(new SelectProductPage().getSearchItems().isPresent(), "SearchBar is Not present ", "SearchBar is present");
		new SelectProductPage().getSearchItems().sendKeys(productName);
		getBooksOptions().click();
        getFilterOption().waitForVisible(10000);
        Validator.verifyTrue(getFilterOption().isPresent(), "user is not able to click a filter Options", "user is able to click an filter Options");
        getFilterOption().click();
        Validator.verifyTrue(getPriceLowToHigh().isPresent(), " not clicking on the sorting radio button", " clicking on the sorting button");
        getSortingMenu().waitForVisible(10000);
        getSortingMenu().click();
        Validator.verifyTrue(getPriceLowToHigh().isPresent(), " not clicking on the priceLowToHigh radio button", " clicking on the  priceLowToHigh button");
        getPriceLowToHigh().waitForVisible(1000);
        getPriceLowToHigh().click();
        Validator.verifyTrue(getFilterOption().isPresent(), "user is not able to click a filter Options", "user is able to click an filter Options");
        getFilterOption().click();
        getSearchResults().waitForVisible(3000);
        String text = getSearchResults().getText();
        Reporter.log("this is the search items avalible"+text);
        Validator.verifyTrue(getSearchResults().isPresent(), "search result is not a equal ", "Search results is equal");
    }
	public void filter(String productName) {
		new UserLoginPage().userLogin();
		Validator.verifyTrue(new SelectProductPage().getSearchItems().isPresent(), "SearchBar is Not present ", "SearchBar is present");
		new SelectProductPage().getSearchItems().sendKeys(productName);
		getBooksOptions().click();
        getFilterOption().waitForVisible(10000);
        Validator.verifyTrue(getFilterOption().isPresent(), "user is not able to click a filter Options", "user is able to click an filter Options");
        getFilterOption().click();
        Validator.verifyTrue(getFormatOption().isPresent(), "user is not able to click a FormatOption", "user is able to click an FormatOption");
        getFormatOption().click();
        getPaperbockOption().waitForSelected(4000);
        Validator.verifyTrue(getPriceLowToHigh().isPresent(), " not clicking on the paperbockOptions", " clicking on the paperbockOptions");
        getPaperbockOption().click();
        Validator.verifyTrue(getFilterOption().isPresent(), "user is not able to click a filter Options", "user is able to click an filter Options");
        getFilterOption().click();
        Validator.verifyTrue(getSearchResults().isPresent(), "search results is not showing", "search result is showing");
	}
	@Override
	protected void openPage(PageLocator locator, Object... args) {
	}

}
