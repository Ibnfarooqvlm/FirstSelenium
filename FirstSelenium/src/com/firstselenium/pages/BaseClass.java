package com.firstselenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	WebDriver driver;
	public BaseClass(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement waitTillVisibility(By byVar)
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(byVar));
		return driver.findElement(byVar);
	}
}
