package MyPractice;

import java.util.Scanner;

public class PrimeNumberCheck {
  public static boolean isPrimeNumber(int n) {
    int count = 0;
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        break;
      } else {
        count = i;
      }
    }
    if (count == n - 1) {
      return true;
    } else {
      return false;
    }
  } 

  public static void main(String[] args) {
    System.out.print("Enter the number: ");
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    input.close();
    if (isPrimeNumber(n)) {
      System.out.println(n + " is a Prime number");
    } else {
      System.out.println(n + " is not a Prime number");
    }
  }
}
