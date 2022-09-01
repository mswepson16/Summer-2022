package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.PageObjectBase;

public class ProductsPageObject extends PageObjectBase {
	public static final String URL = "https://ampeg.com/products/";
	
	public ProductsPageObject(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}
	
	public svtProPageObject svtPro(){
		WebElement element = getDriver().findElement(By.cssSelector("[href = \"/products/pro/\"]"));
		element.click();
		
		activateNewTab();
		
		return new svtProPageObject(getDriver(), getBaseUrl());
		
	}
	
	public classicPageObject classic() {
		WebElement element = getDriver().findElement(By.cssSelector("[href = \"/products/classic/\"]"));
		element.click();
		
		activateNewTab();
		
		return new classicPageObject(getDriver(), getBaseUrl());
	}
	
}
