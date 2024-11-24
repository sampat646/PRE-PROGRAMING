public class EvenNumber {
    public static void main(String[] args) {
        int i = 1;

        /*
         * while (i <= 10) {
         * if (i % 2 != 0) {
         * System.out.println(i);
         * }
         * i++;
         * }
         */
        int sum = 0;

        do {
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;

            }
            i++;
        } while (i <= 10);
        System.out.println("sum of even number is " + sum);

    }
}
