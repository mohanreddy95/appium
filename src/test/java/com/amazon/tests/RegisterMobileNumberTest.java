package com.amazon.tests;

import org.testng.annotations.Test;

import com.amazon.pages.UserRegisterPage;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class RegisterMobileNumberTest{
	@Test
	public void registerMobileNumber() {
		UserRegisterPage mobileNumber=new UserRegisterPage();
		mobileNumber.registerMobileNumber();
		
	}

}
