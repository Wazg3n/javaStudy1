package package1;

import java.io.FileWriter;
import java.io.IOException;

public class MainFileWriter {

	public static void main(String[] args) {
		
		try {
			FileWriter writer = new FileWriter("poem.txt");
			writer.write("Roses are red\n Violets are blue \n you");
			writer.append("\n(my poem)");
			writer.close();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
