package tests;

public class Bass {
	private String Make;
	private String Model;
	private int StringCount;
	
	public String getMake() {
		return Make;
	}
	
	public void setMake(String make) {
		Make = make;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	
	@Override
	public String toString() {
		return "BassesTest [Make=" + Make + ", Model=" + Model + "]";
	}
}

