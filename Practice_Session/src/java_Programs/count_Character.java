package java_Programs;

public class count_Character {

	public static void main(String[] args) {
		String str = "This is my first program";
		int count=0;
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)!=' ')
				count++;
			
		}
		System.out.println("Count of characters in given sentence is " + count);

	}

}
