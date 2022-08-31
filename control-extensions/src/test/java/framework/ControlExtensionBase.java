package framework;

import org.openqa.selenium.WebElement;

public abstract class ControlExtensionBase {
	
	private WebElement mappedElement;
	
	protected ControlExtensionBase(WebElement mappedElement) {
		this.mappedElement = mappedElement;
	}
	
	public WebElement getMappedElement() {
		return this.mappedElement;
	}
}
