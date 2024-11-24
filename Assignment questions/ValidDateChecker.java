import java.util.Scanner;

public class ValidDateChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yearCount = 0, year = 0;
        boolean isValid = false;

        System.out.println("Enter the date");
        int date = sc.nextInt();

        System.out.println("Enter the Month");
        int month = sc.nextInt();

        System.out.println("Enter the year ");
        year = sc.nextInt();

        if ((year > 1000 && month >= 1 && month <= 12)) {

            if (month == 2) {
                boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
                if ((isLeapYear && date >= 1 && date <= 29) || (!isLeapYear && date >= 1 && date <= 28)) {
                    isValid = true;
                }
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                if (date >= 1 && date <= 30) {

                    isValid = true;
                }
            } else {
                if (date >= 1 && date <= 31) {
                    isValid = true;
                }

            }

        }
        if (isValid) {
            System.out.println("valid date");
        } else {
            System.out.println("Not valid date");
        }

    }
}
