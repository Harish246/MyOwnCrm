package com.InTouch.Signin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.InTouch.genericlib.BaseTest;

public class DashboardsPage {
		@FindBy(xpath = "//td[contains(text(),'Dashboards')]") private WebElement dashboardText;
		public DashboardsPage()
		{
			PageFactory.initElements(BaseTest.driver, this);
		}

		public WebElement getDashboardsAddress() {
			return dashboardText;
		}

	}
