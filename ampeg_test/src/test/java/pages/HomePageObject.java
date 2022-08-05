package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.PageObjectBase;

public class HomePageObject extends PageObjectBase {
	public static final String URL = "https://ampeg.com/index.html";
	public HomePageObject(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}
	
	public HomePageObject navigate() {
		getDriver().navigate().to(getBaseUrl());
		
		return this;
	}
	
	public SubscriptionPageObject subscribe() {
		WebElement element = getDriver().findElement(By.id("mc-embedded-subscribe"));
		element.click();
		
		activateNewTab();
		
		return new SubscriptionPageObject(getDriver(), getBaseUrl());
	}
	
	public ProductsPageObject products() {
		WebElement element = getDriver().findElement(By.cssSelector("[title = \"Products\"]"));
		element.click();
		
		activateNewTab();
		
		return new ProductsPageObject(getDriver(), getBaseUrl());
	}
	
}