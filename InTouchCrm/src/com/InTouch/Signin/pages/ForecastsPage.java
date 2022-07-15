package com.InTouch.Signin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.InTouch.genericlib.BaseTest;

public class ForecastsPage {
	@FindBy(xpath = "//td[contains(text(),'Forecasts: ')]") private WebElement forecastsText;
	public ForecastsPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getForecastsAddress() {
		return forecastsText;
	}

}
