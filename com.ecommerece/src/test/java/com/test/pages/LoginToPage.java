package com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginToPage {
	WebDriver driver;
	
	public LoginToPage(WebDriver Idriver ) {
		this.driver=Idriver;
	}

	@FindBy(name="username") WebElement LoginUserName;
	@FindBy(name="password") WebElement LoginUserPassword;
	@FindBy(name="signon") WebElement LoginButton;

 public void loginToAccount(String loginName, String loginPwd) {
	 LoginUserName.clear();
	 LoginUserName.sendKeys(loginName);
	 LoginUserPassword.clear();
	 LoginUserPassword.sendKeys(loginPwd);
	 LoginButton.click();
	 
 }

}
