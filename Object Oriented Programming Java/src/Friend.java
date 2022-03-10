 
public class Friend {

	String name;
	//If we remove static then Friends will each have their own copy of numberOfFriends
	static int numberOfFriends;
	
	Friend(String name){
		this.name = name;
		numberOfFriends++;
}
	
	static void displayFriends() {
		System.out.println("You have "+numberOfFriends+ " friends");
	}
	}