package framework;

import org.openqa.selenium.WebElement;

public class ControlExtensionFactory {
	
	public Textbox getTextbox(WebElement element) {
		return new Textbox(element);
	}
	
	public RadioButton selectRadioButton(WebElement element) {
		return new RadioButton(element);
	}
	
	public RadioButton getIsSelected(WebElement element) {
		return new RadioButton(element);
	}
	
	public Link clickLink(WebElement element) {
		return new Link(element);
	}
}
