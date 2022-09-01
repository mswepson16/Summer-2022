package dataProvider;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverManager extends WebDriverManager{
	public void createEdgeDriver() {
		System.setProperty("webdriver.edge.driver", DRIVER_DIR + "msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
	}
}
