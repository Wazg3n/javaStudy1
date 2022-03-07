
public class overloadedMethods {

	public static void main(String[] args) {
		
		// overloaded methods = methods that share the same name but have different parameters
		//                      method name + parameters = method signature
		
		double x = add(1.0,2.0,3.0);
		
		System.out.println(x);
		
	}
	
	static int add(int a, int b) {
		System.out.println("overload 1");
		return a + b;
	}
	static int add(int a,int b, int c) {
		System.out.println("overload 2");
		return a + b + c;
	}
	static int add(int a,int b, int c, int d) {
		System.out.println("overload 3");
		return a + b + c + d;
	}

	static double add(double a, double b) {
		System.out.println("overload 6");
		return a + b;
	}
	static double add(double a,double b, double c) {
		System.out.println("overload 7");
		return a + b + c;
	}
	static double add(double a,double b, double c, double d) {
		System.out.println("overload 8");
		return a + b + c + d;
	}
	
}
