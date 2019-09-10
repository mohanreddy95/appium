package com.android.tests;

import org.testng.annotations.Test;

import com.android.pages.UserLoginPage;

public class UserLoginTest {
	@Test
	public void userLogin()
	{
		UserLoginPage login=new UserLoginPage();
		login.userLogin();
	}

}
