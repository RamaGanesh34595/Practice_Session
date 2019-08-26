package inheritancePack;

public class Class_Three extends Class_Two {

	public static void main(String[] args) {
	
		sumMethod();
		
		Class_Two obj = new Class_Two();
		obj.sumMethod();

	}
	
	
	public static void addMethod3 () {
		System.out.println("Class three add method");
	}

	public static void sumMethod () {
		System.out.println("Class three add method");
	}
	
	public static void playMethod (int a, int b) {
		System.out.println("Class three add method " + (a + b));
	}

}
