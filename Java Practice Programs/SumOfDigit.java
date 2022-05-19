package MyPractice;

import java.util.Scanner;

public class SumOfDigit {
  public static int getSum(int n) {
    int r, sum = 0;
    while (n != 0) {
      r = n % 10;
      sum += r;
      n = n / 10;
    }
    return sum;
  }

  public static void main(String[] args) {
    System.out.print("Enter the integer: ");
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    in.close();
    System.out.print("Sum of all digit of " + n + " is: " + getSum(n));
  }
}
