package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.ControlExtensionBase;
import framework.Link;
import framework.PageObjectBase;
import framework.SelectMenu;

public class SelectMenuPage extends PageObjectBase{

	private final String URL = "/slider";
	
	public SelectMenuPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}
	
	public SelectMenuPage navigate() {
		super.navigate(URL);
		
		return this;
	}
	
	public SelectMenuPage clickSlider(String value) {
		WebElement element = getDriver().findElement(By.id(value));
		SelectMenu slider = new SelectMenu(element);
		slider.click();
		
		return this;
	}
	
	public SelectMenuPage getLink() {
		
		SelectMenu.getIsSelected();
		
		return this;
	}
}
