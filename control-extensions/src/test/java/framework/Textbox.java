package framework;

import org.openqa.selenium.WebElement;

public class Textbox extends ControlExtensionBase {
	
	public Textbox(WebElement mappedElement) {
		super(mappedElement);
	}
	
	public void setValue(String value) {
		this.getMappedElement().sendKeys(value);
	}
	
	public String getValue() {
		return this.getMappedElement().getAttribute("value");
	}
}
