package com.InTouch.Signin;


import org.testng.annotations.Test;

import com.InTouch.Signin.pages.SigninPage;
import com.InTouch.genericlib.BaseTest;
import com.InTouch.genericlib.FileLib;
import com.InTouch.genericlib.WebDriverCommonLib;

public class LoginTest extends BaseTest{

	@Test
	public void login() throws Throwable {
		SigninPage sp=new SigninPage();
		FileLib flib=new FileLib();
		String un=flib.readPropertyData(PROP_PATH, "username");
		String pwd=flib.readPropertyData(PROP_PATH, "password");
		sp.signIn(un, pwd);
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.verify(wlib.getPageTitle(),flib.readPropertyData(PROP_PATH, "homeTitle"),"HOME PAGE");
		
		
	}
}

