package com.android.tests;

import org.testng.annotations.Test;

import com.android.pages.UserRegisterPage;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class RegisterMobileNumberTest{
	@Test
	public void registerMobileNumber() {
		UserRegisterPage mobileNumber=new UserRegisterPage();
		mobileNumber.registerMobileNumber();
		
	}

}
