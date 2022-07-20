package dataProvider;

public abstract class WebDriverManager {
	
	protected static final String DRIVER_DIR = "src/test/resources/";
	
	protected static EdgeDriverManager getEdgeDriver() {
		return new EdgeDriverManager();
				
	}

	protected static ChromeDriverManager getChromeDriver() {
		return new ChromeDriverManager();
		
	}
}
