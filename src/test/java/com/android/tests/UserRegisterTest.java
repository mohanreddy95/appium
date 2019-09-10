package com.android.tests;

import org.testng.annotations.Test;

import com.android.pages.UserRegisterPage;

public class UserRegisterTest  {
	
	@Test
	public void register ()  {
		UserRegisterPage register = new UserRegisterPage();
		register.createAccount();
	}

}
