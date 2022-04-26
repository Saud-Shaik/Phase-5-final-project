package com.simplilearn.AutomationRegLogJekins;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;




public class FirstTestWithTestNGFramework {
	WebDriver driver;

	@BeforeClass
	public void testSetup()
	{
	System.setProperty("webdriver.chrome.driver", "F:\\selenium-java-3.5\\chromedriver.exe");
	driver=new ChromeDriver();
	

	}

	@BeforeMethod
	public void openBrowser()
	{
	driver.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&prevRID=MV2CEDAY7BDJZC7E0R4A&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	
	System.out.println("We are currently on the following URL" +driver.getCurrentUrl());
	
	}

	@Test(description="This method validates the sign up functionality")
	public void Signup()
	{

		
		WebElement name=driver.findElement(By.cssSelector("#ap_customer_name"));
		name.sendKeys("Saud Shaik");
	

		WebElement name1=driver.findElement(By.cssSelector("#auth-country-picker-container"));
		name1.sendKeys("IN +91");
	

		WebElement phone=driver.findElement(By.cssSelector("#ap_phone_number"));
		phone.sendKeys("8114663005");
	

		WebElement email=driver.findElement(By.cssSelector("#ap_email"));
		email.sendKeys("soudshaik18@gmail.com");

		WebElement pass=driver.findElement(By.cssSelector("#ap_password"));
		pass.sendKeys("Saud@3005");
	

		WebElement button= driver.findElement(By.cssSelector("#continue"));

	}

	@AfterMethod
	public void postSignUp()
	{
	System.out.println(driver.getCurrentUrl());

	}

	@AfterClass
	public void afterClass()
	{
	driver.quit();
	}

	}