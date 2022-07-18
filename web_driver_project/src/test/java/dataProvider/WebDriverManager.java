package dataProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public abstract class WebDriverManager {
	
	private static final String DRIVER_DIR = "src/test/resources/";
	
	protected static WebDriver getEdgeDriver() {
		System.setProperty("webdriver.edge.driver", DRIVER_DIR + "msedgedriver.exe");
		return new EdgeDriver();
	}

	protected static WebDriver getChromeDriver() {
		System.setProperty("webdriver.chrome.driver", DRIVER_DIR + "chromedriver.exe");
		return new ChromeDriver();
	}
}
