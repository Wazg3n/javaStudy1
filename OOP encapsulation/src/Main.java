
public class Main {

	public static void main(String[] args) {
		// Encapsulation = attributes of a class will be hidden or private
		//               = Can be accessed only through methods (getters & setters)
		//               = You should make attributes private if you don't have a reason to make them public/protected

		Car car1 = new Car("Chevy", "Camaro", 2021);
		//Car car2 = new Car("audi", "A8", 2021);
		//to get the make that is public in class car we need to use car.getMake,,,
			
			//change attributes with setter made in Car class
			
		//car2.copy(car1);
		//taking car1 and applying its attributes to car2
		Car car2 = new Car(car1);
		
			car1.setYear(2021);
			
		 System.out.println(car1);
		 System.out.println(car2);
		 System.out.println();
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println();
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());
		
		
	}

}
