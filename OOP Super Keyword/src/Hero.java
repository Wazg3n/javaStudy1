
public class Hero extends Person{
	
	String power;
	
	Hero(String name, int age, String power){
		super(name,age);
		//now the name and age lines are not needed because they are in the super method
		
		this.power = power;
		
		
	}

	public String toString() {
		return super.toString()+this.power;
	}
}
