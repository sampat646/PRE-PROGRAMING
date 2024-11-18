import java.util.Scanner;

public class Divisibleby3515 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        if (num % 3 == 0) {
            System.out.println("Sanju loves geetha");
        } else if (num % 5 == 0) {
            System.out.println("geeta loves sanju");
        } else if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("marrige");
        } else {
            System.out.println("Break up");

        }
    }
}
