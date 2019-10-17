package com.amazon.tests;

import org.testng.annotations.Test;

import com.amazon.pages.UserRegisterPage;

public class UserRegisterTest  {
	
	@Test
	public void register ()  {
		UserRegisterPage register = new UserRegisterPage();
		register.createAccount();
	}

}
