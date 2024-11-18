import java.util.Scanner;

public class getday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number");
        int inp = sc.nextInt();

        if (inp == 1) {
            System.out.println("Sunday");
        } else if (inp == 2) {
            System.out.println("Monday");
        } else if (inp == 3) {
            System.out.println("Tuesday");

        } else if (inp == 4) {
            System.out.println("Wednesday");

        } else if (inp == 5) {
            System.out.println("thursday");

        } else if (inp == 6) {
            System.out.println("Friday");

        } 
        else if (inp == 6) {
            System.out.println("saturday");

        }else {
            
            System.out.println("Enter the vaild input");
        }
    }
}
