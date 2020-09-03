package com.test.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utility.DataProviderByExcel;

public class createUserPage {
	public WebDriver driver;
	public DataProviderByExcel userDetails;
	public createUserPage(WebDriver Idriver) {
		this.driver=Idriver;
		
	}

	@FindBy(xpath="//a[contains(text(),'Register Now!')]") WebElement registerNow;
	@FindBy(name="username") WebElement username;
	@FindBy(name="password") WebElement password;
	@FindBy(name="repeatedPassword") WebElement confirmpassword;
	@FindBy(name="account.firstName") WebElement firstName;
	@FindBy(name="account.lastName") WebElement lastName;
	@FindBy(name="account.email") WebElement email;
	@FindBy(name="account.phone") WebElement phoneNumber;
	@FindBy(name="account.address1") WebElement address_1;
	@FindBy(name="account.address2") WebElement address_2;
	@FindBy(name="account.city") WebElement cityName;
	@FindBy(name="account.state") WebElement stateName;
	@FindBy(name="account.zip") WebElement zipCode;
	@FindBy(name="account.country") WebElement countryName;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Enable MyList')]/following::td/input[@name='account.listOption']") WebElement enableMyListCheckBox;
	
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Enable MyBanner')]/following::td/input[@name='account.bannerOption']") WebElement enableMyBanner;
	@FindBy(name="newAccount") WebElement newAccount;
	
	
	
	
	
	
	public WebDriver clickOnRegisterNewUser() {
		registerNow.click();
		System.out.println("clicked on register link");
		return driver;
	}
	
	public DataProviderByExcel createUser() throws IOException {
		/*username.sendKeys("leena1");
		password.sendKeys("leena@123");
		confirmpassword.sendKeys("leena@123");
		firstName.sendKeys("john");
		lastName.sendKeys("smith");
		email.sendKeys("john.smith@gmail.com");
		phoneNumber.sendKeys("1234567890");
		address_1.sendKeys("FosterCity");
		address_2.sendKeys("Street No12");
		cityName.sendKeys("Florida");
		stateName.sendKeys("Florida");
		zipCode.sendKeys("123456");
		countryName.sendKeys("United States");*/
		
		
		userDetails= new DataProviderByExcel();
		username.sendKeys(userDetails.getStringdata("UserDetails",0,0));
		password.sendKeys(userDetails.getStringdata("UserDetails",0,1));
		confirmpassword.sendKeys(userDetails.getStringdata("UserDetails",0,2));
		firstName.sendKeys(userDetails.getStringdata("UserDetails",0,3));
		lastName.sendKeys(userDetails.getStringdata("UserDetails",0,4));
		email.sendKeys(userDetails.getStringdata("UserDetails",0,5));
		phoneNumber.sendKeys(userDetails.getStringdata("UserDetails",0,6));
		address_1.sendKeys(userDetails.getStringdata("UserDetails",0,7));
		address_2.sendKeys(userDetails.getStringdata("UserDetails",0,8));
		cityName.sendKeys(userDetails.getStringdata("UserDetails",0,9));
		stateName.sendKeys(userDetails.getStringdata("UserDetails",0,10));
		zipCode.sendKeys(userDetails.getStringdata("UserDetails",0,11));
		countryName.sendKeys(userDetails.getStringdata("UserDetails",0,12));
		
		enableMyListCheckBox.click();
		enableMyBanner.click();
		newAccount.submit();
		return userDetails;
		
			
		
		
	}
	
}
