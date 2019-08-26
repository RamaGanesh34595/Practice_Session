package mainMethod;

public class With_Arguments_Class {

	public static void main(String[] args) {
		
		addMethod(23, 45);
		addMethod(4, 4);

	}
	
	public static void addMethod (int a, int b) {
		int c = a + b;
		System.out.println("Hi - " + c);
	}


}
