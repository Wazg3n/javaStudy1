
public class Methods {

	public static void main(String[] args) {
		
		// method = a block of code that is executed whenever it is called upon
		
		String name = "Bro";
		int age = 21;
		
		hello(name,age);

	}
	
	//add title or name whatever
	 static void hello(String name, int age) {
		System.out.println("Hello " +name);
		System.out.println("you are " + age);
	}

}
