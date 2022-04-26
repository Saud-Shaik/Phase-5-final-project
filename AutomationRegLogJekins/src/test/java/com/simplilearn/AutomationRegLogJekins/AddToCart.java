package com.simplilearn.AutomationRegLogJekins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddToCart {
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
	@Test(description="This method validates the add item functionality")
	public void AddItem()
	{

		
		WebElement name=driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		name.sendKeys("Laptops");
	}
}
