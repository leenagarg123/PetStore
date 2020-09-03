package com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	public WebDriver driver;
	
	public HomePage(WebDriver Idriver) {
		
		this.driver=Idriver;
	}

	@FindBy(xpath="//a[contains(text(),'Sign In')]") WebElement signin;
	@FindBy(name="keyword") WebElement searchBox;
	@FindBy(name="searchProducts") WebElement searchButton;
	
	public WebDriver clickOnSignIn() {
		signin.click();
		return driver;
	}
	
	public void searchWithKeyWord() {
		searchBox.sendKeys("Dogs");
		searchButton.click();
		System.out.println("clicked the search button");
	}
}
