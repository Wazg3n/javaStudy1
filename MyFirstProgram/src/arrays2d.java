
public class arrays2d {

	public static void main(String[] args) {
		
		String[][] cars = new String[3][3];
		
		cars[0][0] = "Camaro";
		cars[0][1] = "Corvette";
		cars[0][2] = "Silverado";
		
		cars[1][0] = "Mustang";
		cars[1][1] = "Ranger";
		cars[1][2] = "Ford";
		
		cars[2][0] = "BMW";
		cars[2][1] = "Mercedes";
		cars[2][2] = "Lambo";
		
		for(int i=0; i<cars.length; i++) {
			System.out.println();
			for(int j=0; j<cars[i].length; j++) {
				System.out.print(cars[i][j]+" ");
				
			}
		}
	}

}
