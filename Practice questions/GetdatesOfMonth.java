import java.util.Scanner;

public class GetdatesOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();

        if (num == 1 || num == 3 || num == 5 || num == 7 || num == 8 || num == 10 || num == 12)
            System.out.println("31 days are there");
        else if (num == 4 || num == 6 || num == 9 || num == 11)
            System.out.println("30 days are there");
        else if (num == 2)
            System.out.println("28 days are there");
        else
            System.out.println("Enter valid number");

    }
}
