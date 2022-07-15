package com.InTouch.Signin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.InTouch.genericlib.BaseTest;

public class CampaignsPage {
@FindBy(xpath = "//td[contains(text(),'Campaigns: ')]") private WebElement campaignsText;
	
	public CampaignsPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getCampaignsAddress() {
		return campaignsText;
	}

}
