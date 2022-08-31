package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.RadioButtonPage;

public class Link  extends ControlExtensionBase {
	
	private WebElement mappedElement;
	
	public Link(WebElement mappedElement) {
		super(mappedElement);
	}
		
	public String getIsSelected() {
		String result;
		result = ;
		return result;
			
		
	}

	public void click() {
		this.mappedElement.click();
	}
}
	
	