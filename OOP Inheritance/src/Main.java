
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car();
		//even though car has no statements, it still shows what vehicle class has assigned because of extends decleration
		car.go();
		
		Bicycle bike = new Bicycle();
		
		bike.stop();
		
		System.out.println(car.speed);
		System.out.println(bike.speed);
		
		System.out.println(car.doors);
		System.out.println(bike.wheels);
	}

}
