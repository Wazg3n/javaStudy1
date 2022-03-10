
public class Main {

	public static void main(String[] args) {
		// abstract = abstract classes cannot be instantiated, but they can have a subclass
		//            abstract methods are declared without an implementation
		
		//so we have to choose a child class of vehicle
		//can't be simple as vehicle

		Car car = new Car();
		//Vehicle vehicle = new Vehicle();
		
		car.go();
		
	}

}
