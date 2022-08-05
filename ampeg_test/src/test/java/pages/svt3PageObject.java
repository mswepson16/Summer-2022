package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.PageObjectBase;

public class svt3PageObject extends PageObjectBase {
	public static final String URL = "https://ampeg.com/products/pro/svt3pro";

	public svt3PageObject(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}
	
	public HomePageObject home(){
		WebElement element = getDriver().findElement(By.cssSelector("[href = \"/\"]"));
		element.click();
		
		activateNewTab();
		
		return new HomePageObject(getDriver(), getBaseUrl());
	}
}
