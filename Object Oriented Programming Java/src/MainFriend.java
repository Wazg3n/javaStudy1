
public class MainFriend {

	public static void main(String[] args) {
		// static = modifier. A single copy of a variable/method is created and shared
		//          The class "owns" the static member
		
		
		
		Friend friend1 = new Friend("Spongebob");
		Friend friend2 = new Friend("Patrick");
		
		//if static is removed, it will have to be accessed like this Friend1.numberOfFriends... but that will only give out 1 each time
		//.....System.out.println(Friend.numberOfFriends);
		
		Friend.displayFriends();
		
		
	}

}
