import java.util.Scanner;

public class digitOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		
		for (; n!=0; n=n/10){
			int digit = n % 10;
			if (digit % 2 !=0){
				System.out.println(digit);
			}
		}
		

	}

}
