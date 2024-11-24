import java.util.Scanner;

public class Digit {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");
        int num = sc.nextInt();

        for(; num!=0; num=num/10){
            int dig = num % 10;
            System.out.println(dig);
        }
    }
}
