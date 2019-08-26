package stringManipulation;

public class String_Replace {

	public static void main(String[] args) {
		// Replacing characters 
        String str1 = "feeksforfeeks"; 
        System.out.println("Original String " + str1); 
        String str2 = "feeksforfeeks".replace('f' ,'g') ; 
        System.out.println("Replaced f with g -> " + str2); 
	}

}
