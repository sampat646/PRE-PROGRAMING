import java.util.Scanner;

class LeapYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        System.out.println();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Yes " + year + " is leap year");
        }
        System.out.println("NO");

    }
}