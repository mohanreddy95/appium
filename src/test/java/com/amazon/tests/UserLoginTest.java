package com.amazon.tests;

import org.testng.annotations.Test;

import com.amazon.pages.UserLoginPage;

public class UserLoginTest {
	@Test
	public void userLogin()
	{
		UserLoginPage login=new UserLoginPage();
		login.userLogin();
	}

}
