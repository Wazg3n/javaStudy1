import java.util.InputMismatchException;
import java.util.Scanner;

public class MainExceptionHandling {

	public static void main(String[] args) {
		//exception = an event that occurs during the execution of a program that,
		//            disrupts the normal flow of instructions
		
		Scanner scanner = new Scanner(System.in);

		try { //this is the dangerous code so we put it in try
		 
		 	System.out.println("Enter a whole number to divide");
		 	int x = scanner.nextInt();

		 	System.out.println("Enter a whole number to divide");
		 	int y = scanner.nextInt();
		 
		 	int z = x/y;
		 
		 	System.out.println("result "+z);
		}
		catch(ArithmeticException e) {// if we encounter an exception we will catch it here and display our own message rather than the program 
			                             //and showing an error
			System.out.println("You cant divide by zero");
			//throw just shows the red error with a message at the end like "not possible"
			//...throw new ArithmeticException("Not possible");
		}
		catch(InputMismatchException e) {
			System.out.println("ONLY NUMBERS");
		}
		catch(Exception e) { //this catches all exceptions but its considered lazy. Pretty much a last resort
			System.out.println("something went wrong");
		}
		finally{ //this block will always execute whether or not we catch an exception. good too close scanners or files that may be open
			//System.out.println("This will always print");
			scanner.close();
		}
	}

}
