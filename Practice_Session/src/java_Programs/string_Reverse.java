package java_Programs;

public class string_Reverse {
	
	/*public static void Reverse(String str) {
		//String str = "RamaGanesh";		
		char str1[] = str.toCharArray();
		
		for (int i = str1.length-1; i >= 0; i--) {
			System.out.print(str1[i]);			
		}
	}*/
	
	
	public static void reverse_String001(String str) {
		String rev="";
		for (int i = str.length()-1; i >=0; i--) {
			rev = rev + str.charAt(i);
			
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		//Reverse("CENTRE FOR GOOD GOVERNANCE");
		reverse_String001("Ramaganesh");
		
			}

}
