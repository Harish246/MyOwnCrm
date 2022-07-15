package com.InTouch.Signin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.InTouch.genericlib.BaseTest;

public class HomePage {
	@FindBy(xpath = "//a[text()='Leads']") private WebElement leadsTab;
	@FindBy(xpath = "//a[text()='Accounts']") private WebElement accountsTab;
	@FindBy(xpath = "//a[text()='Contacts']") private WebElement contactsTab;
	@FindBy(xpath = "//a[text()='Potentials']") private WebElement potentialsTab;
	@FindBy(xpath = "//a[text()='Campaigns']") private WebElement campaignsTab;
	@FindBy(xpath = "//a[text()='Reports']") private WebElement reportsTab;
	@FindBy(xpath = "//a[text()='Dashboards']") private WebElement dashboardsTab;
	@FindBy(xpath = "//a[text()='Forecasts']") private WebElement forecastsTab;
	@FindBy(xpath = "//a[text()='Activities']") private WebElement activitiesTab;
	@FindBy(xpath = "//a[text()='Products']") private WebElement productsTab;
	
	
	public HomePage() 
	{
	PageFactory.initElements(BaseTest.driver, this);
	}

	//Accounts

public WebElement getAccountsTab() 
	{
	return accountsTab;
	}


public void clickAccountsTab() 
	{
	accountsTab.click();
	}

	//Leads

public WebElement getLeadsTab() 
	{
return leadsTab;
	}


public void clickLeadsTab() 
	{
	leadsTab.click();
	}

	//Contacts

public WebElement getContactsTab() 
	{
return contactsTab;
	}


public void clickContactsTab() 
	{
	contactsTab.click();
	}

//Potentials

public WebElement getPotentialsTab() 
	{
return potentialsTab;
	}


public void clickPotentialsTab() 
	{
	potentialsTab.click();
}

//Campaigns

public WebElement getCampaignsTab() 
{
return campaignsTab;
}


public void clickCampaignsTab() 
{
	campaignsTab.click();


}

//Reports

public WebElement getReportsTab() 
{
return reportsTab;
}


public void clickReportsTab() 
{
	reportsTab.click();


}

//Reports

public WebElement getDashboardsTab() 
{
return dashboardsTab;
}


public void clickDashboardsTab() 
{
	dashboardsTab.click();
}


//Forecasts

public WebElement getForecastsTab() 
{
return forecastsTab;
}


public void clickForecastsTab() 
{
	forecastsTab.click();
}

//Activities

public WebElement getActivitiesTab() 
{
return activitiesTab;
}


public void clickActivitiesTab() 
{
	activitiesTab.click();
}

//Products

public WebElement getProductsTab() 
{
return productsTab;
}

public void clickProductsTab() 
{
	productsTab.click();
}


}
