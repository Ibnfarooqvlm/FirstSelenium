package com.firstselenium.testcases;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.firstselenium.pages.GoogleImagePage;

public class UseExistingPage {

	WebDriver driver;
	String searchStr = "Quran";
	
	@Test(priority = 1)
	public void connectToExisting()
	{
		/*try {
			driver = new RemoteWebDriver(
			        new URL("http://localhost:7055/hub"),DesiredCapabilities.firefox());
			
			//driver = new RemoteWebDriver(new URL("https://www.google.com/search?site=imghp&tbm=isch&source=hp&biw=1366&bih=659&q=Quran&oq=Quran&gs_l=img.12...1358.1370.0.1406.5.1.0.0.0.0.0.0..0.0....0...1ac.1.64.img..5.0.0.efXG_2iWCVk#imgrc=_"),DesiredCapabilities.firefox());			
			driver = new RemoteWebDriver(new URL("http://localhost:7055/hub"), DesiredCapabilities.firefox());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/		
		
		for(String str : GoogleImages.driver.getWindowHandles())			
			System.out.println(str);
		/*new GoogleImagePage(driver)
		.setSearchText(searchStr)
		.clickOnSearch()
		.clickOnFirstImge();*/
	}	
}
