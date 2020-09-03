package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.test.pages.BaseTestClass;
import com.test.pages.HomePage;
import com.test.pages.LoginToPage;
import com.test.pages.LogoutPage;
import com.test.pages.SearchPage;
import com.test.pages.createUserPage;

import utility.DataProviderByExcel;


public class loginclass extends BaseTestClass {
	
	
	@Test
	public void loginToApp() throws InterruptedException, IOException {
		
		logger=report.createTest("Create a new user");
		
		HomePage homepage=PageFactory.initElements(driver, HomePage.class);
		logger.info("Step 1 :Create a user");
		driver=homepage.clickOnSignIn();
		
		createUserPage createnewUser=PageFactory.initElements(driver, createUserPage.class);
		createnewUser.clickOnRegisterNewUser();
		userDetails=createnewUser.createUser();
		
		LoginToPage LoginPage=PageFactory.initElements(driver, LoginToPage.class);
		logger.info("After Registration logged in to Petstore");
		LoginPage.loginToAccount(userDetails.getStringdata("UserDetails",0,0),userDetails.getStringdata("UserDetails",0,1));
		
		logger.info("Step 2: Search for dog");
		homepage.searchWithKeyWord();
		
		SearchPage searchWithName=PageFactory.initElements(driver, SearchPage.class);
		logger.info("Step 3 : Find if “Chihuahua” exist in the list of dog.");
		searchWithName.getListOfDogs();
		logger.info("Step 4 :Add Second chihuahua from the list to the cart");
		searchWithName.addExistDogInList();	
		logger.info("Step 5: Add buy the item.");
		searchWithName.BuyTheItem();
		
		LogoutPage logoutfromsite=PageFactory.initElements(driver, LogoutPage.class);
		logger.info("Step 6 : Logout");
		logoutfromsite.logout();
		logger.info("Step 7 :And Login again");
		homepage.clickOnSignIn();
		LoginPage.loginToAccount(userDetails.getStringdata("UserDetails",0,1),userDetails.getStringdata("UserDetails",0,2));
	}
	

}
