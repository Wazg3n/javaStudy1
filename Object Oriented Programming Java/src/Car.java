
public class Car {

	String make = "audi";
    String model ="rs";
    int year = 2022;
    String color = "black";
    double price = 120000.00;
	
    public String toString() { 
    	return make +"\n"+model+"\n"+color+"\n"+year;
    }
    
    void drive() {
    	System.out.println("you drive the car");
    }
    void brake() {
    	System.out.println("You step on the brakes");
    }
    
    

	}




