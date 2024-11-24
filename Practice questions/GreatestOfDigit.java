import java.util.Scanner;

public class GreatestOfDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		int max = n % 10;
		
//		for (; n!=0; n=n/10){
//			int digit = n % 10;
//			if (digit > max){
//				max = digit;+
//			}
//		}
//		System.out.println(max);
	
	// we can do using the while loop also.
		while (n!=0) {
			int digit = n % 10;
			if(digit > max) {
				max = digit;
			}
			n=n/10;
		}
		System.out.println(max);

	}
	

}
