package dataProvider;


public class EdgeDriverManager extends WebDriverManager{
	public void createEdgeDriver() {
		System.setProperty("webdriver.edge.driver", DRIVER_DIR + "msedgedriver.exe");
		
		
	}
}
