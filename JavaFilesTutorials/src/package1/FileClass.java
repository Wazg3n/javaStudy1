package package1;

import java.io.File;

public class FileClass {

	public static void main(String[] args) {
		// file = an abstract representation of file and directory path names
		
		//we will search for a file inside our project folder

		// if file is somewhere else we do this: With double backslashes or one forward slash/ each
		//File file = new File("C:\\Users\\araba\\Desktop");
		File file = new File("secret_message.txt");
		
		if(file.exists()) {
			System.out.println("That file exists");
			System.out.println(file.getPath()); //this displays the file path in console
			System.out.println(file.getAbsolutePath()); //this shows the full file path
			System.out.println(file.isFile()); //verifies if file is file or folder
			//file.delete(); //deletes file. Refresh folder after for file to be gone
			
		}
		else {
			System.out.println("That file doesnt exist");
		}
		
	
		
		
	}

}
