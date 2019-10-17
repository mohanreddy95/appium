package com.amazon.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;

public class UserLoginPage extends WebDriverBaseTestPage<WebDriverTestPage> {
	@FindBy(locator="amazonlogin.login.rbtn")
	private QAFWebElement loginRbtn;
	@FindBy(locator="amazonlogin.phonenumberemailid.txt")
	private QAFWebElement phoneNumberEmailIdField;
	@FindBy(locator="amazonlogin.continue.btn.xpath")
	private QAFWebElement logincontinueBtn;
	@FindBy (locator="amazonlogin.password.txt")
	private QAFWebElement passwordField;
	@FindBy(locator="amazonlogin.signInSubmit.btn")
	private QAFWebElement loginBtn;
	@FindBy(locator="amazonlogin.loginimg.img")
	private QAFWebElement loginImg;
	
	public QAFWebElement getLoginRbtn() {
		return loginRbtn;
	}
	public QAFWebElement getPhoneNumberEmailIdField() {
		return phoneNumberEmailIdField;
	}
	public QAFWebElement getLoginContinueBtn() {
		return logincontinueBtn;
	}
	public QAFWebElement getPasswordField() {
		return passwordField;
	}
	public QAFWebElement getLoginBtn() {
		return loginBtn;
	}
	@Override
	protected void openPage(PageLocator locator, Object... args) {
	}
	public void userLogin()
	{
		UserRegisterPage register=new UserRegisterPage();
		Validator.verifyTrue(register.getSkipSigninBtn().isPresent(), "user canot able to click on skipSignin button", "user can able to click on skipSignin button");
		register.getSkipSigninBtn().click();
		Validator.verifyTrue(register.getHomeMenu().isPresent(), "user canot able to click on hamemenu", "user can able to click on homemenu");
		register.getHomeMenu().click();
		Validator.verifyTrue(register.getSignin().isPresent(), "user canot able to click on signin ", "user can able to click on Signin");
		register.getSignin().click();
		getLoginRbtn().click();
		Validator.verifyTrue(register.getPhoneNumberEmailIdField().isPresent(), "user not enter 10 digits phone Number", "user enter 10 digits phone number");
		getPhoneNumberEmailIdField().sendKeys("9666154861");
		getLoginContinueBtn().click();
		Validator.verifyTrue(register.getPasswordField().isPresent(), "invlid emailid& password", "user enter valid user id and password");
		getPasswordField().sendKeys("mohanp");
		getLoginBtn().click();
		register.getHomeMenu().waitForVisible(3000);
		Validator.verifyTrue(register.getHomeMenu().isPresent(), "user canot able to login successfully", "user can able to login successfully");
		Reporter.log("user can able to login successfully");	
	}
}
