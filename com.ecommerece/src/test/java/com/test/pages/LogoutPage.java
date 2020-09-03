package com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage {
	
	WebDriver driver;

	public LogoutPage(WebDriver Idriver) {
		this.driver=Idriver;
		
	}
	
	@FindBy(css="a[href*='signoff']") WebElement LogoutButton;
	
	public void logout() {
		LogoutButton.click();
	}
}
