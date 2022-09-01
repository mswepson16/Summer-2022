package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.PageObjectBase;

public class svtProPageObject extends PageObjectBase {
	public static final String URL = "https://ampeg.com/products/pro";
	
	public svtProPageObject(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}
	
	public svt3PageObject svt3(){
		WebElement element = getDriver().findElement(By.cssSelector("[href = \"svt3pro/\"]"));
		element.click();
		
		activateNewTab();
		
		return new svt3PageObject(getDriver(), getBaseUrl());
		
	}

}
