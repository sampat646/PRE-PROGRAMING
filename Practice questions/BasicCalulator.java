import java.util.Scanner;

public class BasicCalulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number ");
        int num2 = scanner.nextInt();

        System.out.println("Choose option 1,2,3,4");
        System.out.println("Enter the option");
        int opt = scanner.nextInt();

        switch (opt) {
            case 1:
                System.out.println("Addition " + num1 + num2);
                break;
            case 2:
                System.out.println("Substraction " + num1 * num2);
                break;
            case 3:
                System.out.println("Multiplication " + num1 * num2);
                break;
            case 4:
                System.out.println("Division " + num1 / num2);
                break;

            default:
                break;
        }

    }
}
