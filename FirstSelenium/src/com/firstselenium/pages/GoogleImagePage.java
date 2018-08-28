package com.firstselenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleImagePage extends BaseClass
{
	By bySearchId = By.id("lst-ib");
	By bySearchBtnName = By.name("btnG");
	By byImageCSS = By.cssSelector("a[class='rg_1']");
	By byImageCSSalt=By.cssSelector("img[alt='Image result for Quran']");
	
	public GoogleImagePage(WebDriver driver)
	{
		super(driver);
	}

	public GoogleImagePage setSearchText(String text)
	{
		driver.findElement(bySearchId).sendKeys(text);
		return this;
	}
	
	public GoogleImagePage clickOnSearch()
	{
		driver.findElement(bySearchBtnName).click();
		return this;
	}
	
	public GoogleImagePage clickOnFirstImge()
	{
		waitTillClickable(byImageCSSalt).click();
		return this;
	}
}
