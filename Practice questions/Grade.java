import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your grade ");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("very good");
                break;
            case 'C':
                System.out.println("good");
                break;
            case 'D':
                System.out.println("Not bad");
                break;
            case 'E':
                System.out.println("fool");
                break;
            default:
                System.out.println("You are failed");
                break;
        }
    }
}
