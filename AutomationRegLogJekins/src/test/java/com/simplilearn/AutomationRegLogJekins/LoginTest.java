package com.simplilearn.AutomationRegLogJekins;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class LoginTest {
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
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	
	System.out.println("We are currently on the following URL" +driver.getCurrentUrl());
	
	}
	@Test(description="This method validates the login functionality")
	public void Login()
	{

		
		WebElement name=driver.findElement(By.cssSelector("#ap_email"));
		name.sendKeys("Soudshaik18@gmail.com");
		
		WebElement button= driver.findElement(By.cssSelector("#continue"));

	}
	@AfterMethod
	public void postLogin()
	{
	System.out.println(driver.getCurrentUrl());

	}

	@AfterClass
	public void afterClass()
	{
	driver.quit();
	}

}
