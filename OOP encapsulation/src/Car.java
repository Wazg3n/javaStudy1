
public class Car {

	private String make;
	private String model;
	private int year;
	
	Car(String make,String model, int year){
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
	}
	
	//cant retrieve make model or year in Main class so we need a getter method to retrieve them
	//this sends it to Main class
	
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public int getYear() {
		return year;
	}
	
	//void when you are not returning anything
	public void setMake(String make) {
		this.make = make;
		
	}
	public void setModel(String model) {
		this.model = model;
		
	}
	public void setYear(int year) {
		this.year = year;
		
	}
}
