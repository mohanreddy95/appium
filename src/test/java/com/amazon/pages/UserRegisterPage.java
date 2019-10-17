package com.amazon.pages;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;

public class UserRegisterPage extends WebDriverBaseTestPage<WebDriverTestPage>{
	@FindBy(locator="welcome.homemenu.menu")
	private QAFWebElement homeMenu;
	
	@FindBy(locator="welcome.signin.txt")
	private QAFWebElement Signin;
	
	@FindBy(locator="amazoncreateaccount.createaccount.rbtn")
	private QAFWebElement createAccountRbtn;
	@FindBy (locator="amazoncreateaccount.customername.txt")
	private QAFWebElement nameField;
	@FindBy (locator="amazoncreateaccount.phonenumber.txt")
	private QAFWebElement phoneNumberField;
	@FindBy(locator="amazoncreateaccount.email.txt")
	private QAFWebElement emailField;
	@FindBy(locator="amazoncreateaccount.password.txt")
	private QAFWebElement passwordField;
	@FindBy(locator="amazoncreateaccount.continue.btn")
	private QAFWebElement continueBtn;
	@FindBy(locator="welcome.skipsignin.btn")
	private QAFWebElement skipSigninBtn;
	@FindBy (locator="verifymobilenumber.verifymobile.btn")
	private QAFWebElement mobileNumber;
	@FindBy(locator="amazoncreateaccount.welcome.txt")
	private QAFWebElement welcome;
	@FindBy(locator="amazonlogin.login.rbtn")
	private QAFWebElement loginRbtn;
	@FindBy(locator="amazonlogin.phonenumberemailid.txt")
	private QAFWebElement phoneNumberEmailIdField;
	@FindBy(locator="amazonlogin.continue.btn.xpath")
	private QAFWebElement logincontinueBtn;
	@FindBy (locator="amazonlogin.password.txt")
	private QAFWebElement loginPasswordField;
	@FindBy(locator="amazonlogin.signInSubmit.btn")
	private QAFWebElement loginBtn;
	@FindBy (locator="amazonmobilenumber.verifymobile.txt")
	private QAFWebElement verifyMobileNumber;
	@FindBy(locator="amazonmobilenumber.verifymobile.txt")
	private QAFWebElement message;

	public QAFWebElement getLoginRbtn() {
		return loginRbtn;
	}

	public QAFWebElement getPhoneNumberEmailIdField() {
		return phoneNumberEmailIdField;
	}

	public QAFWebElement getLoginContinueBtn() {
		return logincontinueBtn;
	}

	public QAFWebElement getLoginPasswordField() {
		return passwordField;
	}

	public QAFWebElement getLoginBtn() {
		return loginBtn;
	}
	
	public QAFWebElement getWelcome() {
		return welcome;
	}

	public QAFWebElement getMobileNumber() {
		return mobileNumber;
	}

	public QAFWebElement getHomeMenu() {
		return homeMenu;
	}

	public QAFWebElement getSignin() {
		return Signin;
	}

	public QAFWebElement getAccountRbtn() {
		return createAccountRbtn;
	}

	public QAFWebElement getNameField() {
		return nameField;
	}

	public QAFWebElement getPhoneNumberField() {
		return phoneNumberField;
	}

	public QAFWebElement getEmailField() {
		return emailField;
	}

	public QAFWebElement getPasswordField() {
		return passwordField;
	}

	public QAFWebElement getContinueBtn() {
		return continueBtn;
	}
	public QAFWebElement getSkipSigninBtn() {
		return skipSigninBtn;
	}
	public void createAccount() 
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		getSkipSigninBtn().click();
		getHomeMenu().click();
		getSignin().click();
		Validator.verifyTrue(getAccountRbtn().isPresent(), "user is not able to click on create account  ", "user is able to click on create account");
		getAccountRbtn().click();
		Validator.verifyTrue(getNameField().isPresent(), "user is not able to enter name ", "user is able to enter name");
		getNameField().sendKeys("mohan");
		Validator.verifyTrue(getPhoneNumberField().isPresent(), "user is not able to enter phone number ", "user is able to enter phone number");
		getPhoneNumberField().sendKeys("9000000009");
		Validator.verifyTrue(getEmailField().isPresent(), "user is not able to enter email ", "user is able to enter email");
		getEmailField().sendKeys("mohanreddy09678898@gmail.com");
		Validator.verifyTrue(getPasswordField().isPresent(), "user is not able to enter password ", "user is able to enter password");
		getPasswordField().sendKeys("mohanreddy");
		waitForPageToLoad();
		getWelcome().click();
		getContinueBtn().click();
		Validator.verifyTrue(verifyMobileNumber.isPresent(), "user canot create register ", "user can register successfully");
		Reporter.log("user able to create account successfully and it is navigating to mobile veri ");	
	}
	public void registerMobileNumber() {
		getSkipSigninBtn().click();
		getHomeMenu().click();
		getSignin().click();
		getAccountRbtn().click();
		Validator.verifyTrue(getNameField().isPresent(), "user is not able to enter name ", "user is able to enter name");
		getNameField().sendKeys("mohan");
		Validator.verifyTrue(getPhoneNumberField().isPresent(), "user is not able to enter phone number ", "user is able to enter phone number");
		getPhoneNumberField().sendKeys("9666154861");
		Validator.verifyTrue(getPasswordField().isPresent(), "user is not able to enter password ", "user is able to enter password");
		getPasswordField().sendKeys("mohandghha");
		getWelcome().click();
		getContinueBtn().click();
		Validator.verifyTrue(message.getText().contains("You indicated you are a new customer,"), "this mobile number is not register before on amazon",
                "You indicated you are a new customer, but an account already exists with the mobile phone number");
	}
	
	@Override
	protected void openPage(PageLocator locator, Object... args) {
		
	}

}
