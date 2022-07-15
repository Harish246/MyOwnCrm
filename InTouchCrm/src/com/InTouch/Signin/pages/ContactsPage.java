package com.InTouch.Signin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.InTouch.genericlib.BaseTest;

public class ContactsPage {
	
	@FindBy(xpath = "//td[contains(text(),'Contacts: ')]") private WebElement contactsText;
	public ContactsPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getContactsAddress() {
		return contactsText;
	}

}
