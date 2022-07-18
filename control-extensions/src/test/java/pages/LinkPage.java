package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.Link;
import framework.PageObjectBase;
import framework.RadioButton;

public class LinkPage extends PageObjectBase{

	private final String URL = "/links";
	
	public LinkPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}
	
	public LinkPage navigate() {
		super.navigate(URL);
		
		return this;
	}
	
	public LinkPage clickLink(String value) {
		WebElement element = getDriver().findElement(By.id(value));
		Link link = new Link(element);
		link.click();
		
		return this;
	}
	
	public LinkPage getApiCall() {
		WebElement element = getDriver().findElement(By.id("linkResponse"));
		Link link = new Link(element);
		link.
		
		return this;
	}
}
