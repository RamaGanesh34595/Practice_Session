package java_Programs;

public class print_Smallest_Number {
	
	public static void print_SmallNumber() {
		int a[] = {4,6,3,2,1,7,8};
		int temp;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length; j++) {
				if(a[i] > a[j]) {
					temp=a[i];
					a[i] = a[j];
					a[j] = temp;
				}				
			}						
		}
		System.out.println("Smallest number is - " + a[0]);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print_SmallNumber();
	}

}