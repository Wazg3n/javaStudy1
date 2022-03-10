
public class Dog extends Animal {

	//Common practice to add override method but gives no functionality
	//we have overwritten the method of speak
	
	@Override
	void speak() {
		System.out.println("The dog says woof");
	}
}
