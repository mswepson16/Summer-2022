package framework;

import org.openqa.selenium.WebElement;

public class RadioButton extends ControlExtensionBase {
	
	private WebElement mappedElement;
	
	public RadioButton(WebElement mappedElement) {
		super(mappedElement);
	}
		
	public Boolean getIsSelected() {
		
			return mappedElement.isSelected();
		
	}

	public void selectRadioButton(WebElement mappedElement) {
			System.out.println(mappedElement);
			mappedElement.click();
	
	}
}
