package com.firstselenium.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.Test;

import com.firstselenium.pages.GoogleImagePage;

public class GoogleImages {

	static WebDriver driver;
	String url = "http://google.com/images";
	String searchStr = "Quran";	

	@Test(priority = 1)
	public void launchURL() {
		
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.startup.homepage_override.mstone", "ignore");
		profile.setPreference("startup.homepage_welcome_url", "about:blank");
		profile.setPreference("startup.homepage_welcome_url.additional","about:blank");
		profile.setPreference("browser.startup.homepage","about:blank");
		profile.setPreference("xpinstall.signatures.required", false);
		profile.setPreference("toolkit.telemetry.reportingpolicy.firstRun", false);
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		driver = new FirefoxDriver(profile);
		//driver = new ChromeDriver();
		driver.get(url);
	}

	@Test(priority = 2)
	public void search()
	{
		new GoogleImagePage(driver)
		.setSearchText(searchStr)
		.clickOnSearch()
		.clickOnFirstImge();
	}
}
