import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");
        int num = sc.nextInt();

        System.out.println("Enter the number ");
        int num1 = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
        System.out.println("----------------------------------");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num1 + " x " + i + " = " + num1 * i);
        }
    }
}
