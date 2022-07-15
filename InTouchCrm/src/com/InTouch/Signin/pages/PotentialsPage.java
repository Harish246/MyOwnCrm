package com.InTouch.Signin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.InTouch.genericlib.BaseTest;

public class PotentialsPage {
	
	@FindBy(xpath = "//td[contains(text(),'Potentials: ')]") private WebElement potentialsText;
	
	public PotentialsPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getPotentialsAddress() {
		return potentialsText;
	}

}
