package com.InTouch.Signin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

import com.InTouch.genericlib.BaseTest;


@Listeners(com.InTouch.genericlib.MyListeners.class)
public class ReportsPage {
	@FindBy(xpath = "//td[contains(text(),'Reports')]") private WebElement reportsText;
	public ReportsPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getReportsAddress() {
		return reportsText;
	}

}
