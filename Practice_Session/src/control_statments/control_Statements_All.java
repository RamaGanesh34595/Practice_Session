package control_statments;

public class control_Statements_All {
	
	// Simple if statement
	public static void simple_If()
	{
		int x=10;
		if(x==10) {
			System.out.println("Value of X is - " + x);
		}
	}
	 
	// if else statement
	public static void if_else() {
		int age=0;
		if (age == 18)
			System.out.println("Age is equals to 18years");
		else
			System.out.println("Age is not equals to 18yrs");
	}
	
	// Nested_If 
	public static void nested_If() {
		int x = 5;
		if(x > 6)
		{
			System.out.println("X is greater than 6");
		}
		else if(x < 6)
		{
			System.out.println("X is less than 6");
		}
		else
		{
			System.out.println("X is equal to 2");
		}
	}
	
	public static void switch_Statement() {
		int i=2;
		   switch(i){
		     case 0:
		     System.out.println("i is 0");
		     break;
		 
		     case 1:
		     System.out.println("i is 1");
		     break;
		 
		     case 2:
		     System.out.println("i is 2");
		     break;
		 
		     case 3:
		     System.out.println("i is 3");
		     break;
		 
		     case 4:
		     System.out.println("i is 4");
		     break;
		 
		     default:
		     System.out.println("i is not in the list");
		     break;
		 }
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
