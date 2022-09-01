package framework;

import org.openqa.selenium.WebElement;

public class SelectMenu extends ControlExtensionBase {
	
	private WebElement mappedElement;
	
	public SelectMenu(WebElement mappedElement) {
		super(mappedElement);
	}
		
	public Boolean getIsSelected() {
		
			return mappedElement.isSelected();
		
	}

	public void click() {
		this.mappedElement.click();
	}
}