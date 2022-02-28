
public class Arrays {

	public static void main(String[] args) {
		
		//array = used to store multiple values in a single variable
		
		
		/*String[] cars = {"Mustang", "Mercedes", "bmw"};
		cars[1] = "Audi";
		
		System.out.println(cars[1]);
		*/
		
		String[] cars = new String[3];
		
		cars[0] = "BMW";
		cars [1] = "Audi";
		cars [2] = "VW";
		
		for(int i = 0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
	}

}
