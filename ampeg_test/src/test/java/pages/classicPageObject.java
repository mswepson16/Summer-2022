package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.PageObjectBase;

public class classicPageObject extends PageObjectBase {
	public static final String URL = "https://ampeg.com/products/classic";
	
	public classicPageObject(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}
	
	public svt410hlfPageObject svt410hlf(){
		WebElement element = getDriver().findElement(By.cssSelector("[href = \"svt410hlf/\"]"));
		element.click();
		
		activateNewTab();
		
		return new svt410hlfPageObject(getDriver(), getBaseUrl());
		
	}

}
