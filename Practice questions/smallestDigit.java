import java.util.Scanner;

public class smallestDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		int min = n % 10;
		
		while (n>0) {
			int digit = n % 10;
			if(digit < min) {
				min = digit;
			}
			n=n/10;
		}
		System.out.println(min);

	}

}
