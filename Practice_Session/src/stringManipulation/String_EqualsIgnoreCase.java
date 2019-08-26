package stringManipulation;

public class String_EqualsIgnoreCase {

	public static void main(String[] args) {
String a = "Geeks";        
    	
        boolean aa = a.equalsIgnoreCase("gEeks"); 
        boolean aaa = a.equalsIgnoreCase("gEeks       ");
    	
        System.out.println("Checking Equality " + aa);
        System.out.println("Checking Equality " + aaa);

	}

}
