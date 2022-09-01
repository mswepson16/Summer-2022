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
		
	public boolean getIsSelected() {
		boolean result;
		result = this.mappedElement.isSelected();
		return result;
			
		
	}

	public void click() {
		this.mappedElement.click();
	}
}
	
	