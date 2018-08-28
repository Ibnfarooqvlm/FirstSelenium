package com.firstselenium.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class GoogleSignin {

	WebDriver driver;
	String url = "http://www.gmail.com";
	
	By emailId = By.id("Email");
	By nextId = By.id("next");
	By passwordId = By.id("Passwd");
	By signInId = By.id("signIn");
	By signOutImage = By.cssSelector("a[title^='Google Account:']");
	By signOut = By.id("gb_71");
	
	public WebElement waitTillLoad(By byVar)
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(byVar));
		return driver.findElement(byVar);
	}
	
	@Test
	public void f() 
	{
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\geckodriver.exe");
		driver = new FirefoxDriver();		
		driver.get(url);
		//give mail id
		driver.findElement(emailId).sendKeys("ahamedabdulrahman@gmail.com");
		//click on next
		driver.findElement(nextId).click();
		//give password		
		waitTillLoad(passwordId).sendKeys("Bismillah*92");
		//click on signin
		waitTillLoad(signInId).click();
		
		//Signout..
		waitTillLoad(signOutImage).click();
		waitTillLoad(signOut).click();
		
	}
	
}
