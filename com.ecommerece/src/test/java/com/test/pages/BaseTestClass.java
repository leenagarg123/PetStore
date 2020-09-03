package com.test.pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import utility.BrowserFactory;
import utility.DataProviderByExcel;

public class BaseTestClass {
	public WebDriver driver;
	public DataProviderByExcel userDetails;
	public ExtentReports report;
	public ExtentTest logger;
	
	@BeforeSuite
	public void setUpSuite() throws IOException {
	
	ExtentHtmlReporter extent=new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Report/penStore.html"));
	report=new ExtentReports();
	report.attachReporter(extent);
	}
	@BeforeTest
	public void setUp() {
		driver=BrowserFactory.startApplication(driver,"chrome","abc");
	}

	@AfterTest
	public void teardown() {
		BrowserFactory.quitBrowser(driver);
	}
	
	@AfterMethod
	public void flushReport() {
		report.flush();
		
		
	}
}
