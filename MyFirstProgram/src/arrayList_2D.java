import java.util.*;
public class arrayList_2D {

	public static void main(String[] args) {
		
		// 2D ArrayList = a dynamic list of lists
		// You can change the size of these lists during runtime
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("pizza");
		
		ArrayList<String> produceList = new ArrayList();
		produceList.add("tomates");
		produceList.add("cheese");
		produceList.add("pepper");
		
		ArrayList<String> drinksList = new ArrayList();
		drinksList.add("water");
		drinksList.add("lucozade");
		
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);
		
		//to retrieve a specific value use bakeryList.get(0)
		System.out.println(groceryList.get(0).get(1));
	}

}
