
public class MainFood_arrayOfObjects {

	public static void main(String[] args) {
		
		//this is the standard
		// int[] numbers = new int[3];

		//Food[] fridge = new Food[3];  OR
		
		Food food1 = new Food("pizza");
		Food food2 = new Food("burger");
		Food food3 = new Food("chips");
		
		Food[] fridge = {food1,food2,food3};
		
		fridge[0] = food1;
		fridge[1] = food2;
		fridge[2] = food3;
		
		System.out.println(fridge[0].name);
		System.out.println(fridge[1].name);
		System.out.println(fridge[2].name);
		
		
	}

}
