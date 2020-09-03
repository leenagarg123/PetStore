package com.test.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {

public WebDriver driver;
	
	public SearchPage(WebDriver Idriver) {
		
		this.driver=Idriver;
		
	}
	
	@FindBy(css="a[href*='DOGS']") WebElement dogLink;
	@FindBy(xpath="//table/tbody/tr[3]/td[5]/a") WebElement addToCartLink;
	@FindBy(css="a[href*='newOrderForm']") WebElement procedToCheckout;
	@FindBy(name="newOrder") WebElement continueButton;
	@FindBy(css="a[href*='confirmed']") WebElement confirmOrderButton;
	
	
	public void getListOfDogs() {
		dogLink.click();
		List<WebElement> ls=driver.findElements(By.xpath("//table/tbody/tr/td"));
		String DogName="Chihuahua";
		for(WebElement ls1:ls) {
			if(ls1.getText().equals(DogName)) {
				System.out.println(" Dog Name exist");
				
			}
		}
		
		
		
	}
	
	public void addExistDogInList() throws InterruptedException {
		List<WebElement> ls=driver.findElements(By.xpath("//table/tbody/tr/td"));
		String DogName="K9-CW-01";
		for(WebElement ls1:ls) {
			if(ls1.getText().equals(DogName)) {
				ls1.click();
			break;
			}
		}
		
		//WebDriverWait wait=new WebDriverWait(driver,20);
		//wait.until(ExpectedConditions.elementToBeClickable(addToCartLink));
		List<WebElement> addToCart=driver.findElements(By.xpath("//table/tbody/tr[3]/td/a"));
		for(WebElement ls2:addToCart) {
			System.out.println(ls2.getText());
			if(ls2.getText().contentEquals("Add to Cart")) {
				ls2.click();
			break;
			}
		}
		
	}

	public void BuyTheItem() {
		procedToCheckout.click();
		continueButton.click();
		confirmOrderButton.click();
	}
}
