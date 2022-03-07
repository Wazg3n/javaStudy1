
public class stringMethods {

	public static void main(String[] args) {
		
		String name = "bro";
		
		//...egaulsIgnoreCase method wont be case sensitive
		//boolean result = name.equals("bro");
		
		//...returns lenght of the name
		//int result = name.length();
		
		//...chooses character at given position
		//char result = name.charAt(1);
		
		//...gives position of string
		//int result = name.indexOf("b");
		
		//...checks if name is empty
		//boolean result = name.isEmpty();
		
		//...changes everything to lower or upper case
		//String result = name.toUpperCase();	
		//String result = name.toLowerCase();
		
		//...removes empty space if there is any
		//String result = name.trim();
		
		//...replaces characters
		String result = name.replace('o', 'a');
		
		System.out.println(result);
		

		
	}

}
