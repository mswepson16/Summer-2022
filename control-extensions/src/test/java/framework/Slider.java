package framework;

import org.openqa.selenium.WebElement;

public class Slider extends ControlExtensionBase {
	
	private WebElement mappedElement;
	
	public Slider(WebElement mappedElement) {
		super(mappedElement);
	}
		
	public Boolean getIsSelected() {
		
			return mappedElement.isSelected();
		
	}

	public void click() {
		this.mappedElement.click();
	}
}