package package1;

public class Main {

	public static void main(String[] args) {
		// polymorphism = greek word for poly-"many", morph-"form"
		//                The ability of an object to identify as more than one type

		//these are also  Object class from the vehicle class so they can identify as Object or Vehicle
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		Boat boat = new Boat();
		
		//all objects identify as vehicles as they are an extension of Vehicle
		Vehicle[] racers = {car,bicycle,boat};
		
		//car.go();
		//bicycle.go();
		//boat.go();
		
		//OR
		
		//This says: if you are a vehicle use the go method. Ofcourse every Object or class is a vehicle as it extends from the vehicle class
		for(Vehicle x : racers) {
			x.go();
		}
		
	}

}
