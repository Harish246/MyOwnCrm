package com.InTouch.Signin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.InTouch.genericlib.BaseTest;

public class ProductsPage {
	@FindBy(xpath = "//td[contains(text(),'Products: ')]") private WebElement productsText;
	public ProductsPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getProductsAddress() {
		return productsText;
	}

}
