class DigitUW {

  public static void main(String[] args) {
    int n = 5621;
    while (n != 0) {
      int digit = n % 10;
      System.out.println(digit);
      n = n / 10;
    }
  //   for (int i = 1; i <= 3; i++) {
  //     for (int j = 1; j <= 3; j++) {
  //       System.out.print(i +" ");
  //     }
  //     System.out.println();
  //   }
  }

}