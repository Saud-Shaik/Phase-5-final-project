package com.simplilearn.AutomationRegLogJekins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchBarTest {
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
	driver.get("https://www.amazon.in/");
	System.out.println("We are currently on the following URL" +driver.getCurrentUrl());
	
	}
	@Test(description="This method validates the searchbar functionality")
	public void SearchBar()
	{

		
		WebElement name=driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		name.sendKeys("Laptops");
		WebElement button= driver.findElement(By.cssSelector("#nav-search-submit-button"));
		}
	@AfterMethod
	public void postSearchBar()
	{
	System.out.println(driver.getCurrentUrl());

	}

	@AfterClass
	public void afterClass()
	{
	driver.quit();
	}
}
