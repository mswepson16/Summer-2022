package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import framework.PageObjectBase;
import framework.RadioButton;

public class RadioButtonPage extends PageObjectBase {
	
	private final String URL = "/radio-button";
		
	public RadioButtonPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}
	
	public RadioButtonPage navigate() {
		super.navigate(URL);
		
		return this;
	}
	
	public RadioButtonPage getRadioButton(String radioId) {
		
		WebElement element = getDriver().findElement(By.id(radioId));
		RadioButton button = new RadioButton(element);
		button.getIsSelected();
		
		return this;
	}
	
	public RadioButtonPage selectRadioButton(String radioId) {
		WebElement element = getDriver().findElement(By.id(radioId));
		System.out.println(element);
		RadioButton button = new RadioButton(element);
		button.selectRadioButton(element);
		
		return this;
	}
	
	
	
}