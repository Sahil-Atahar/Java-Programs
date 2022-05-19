package MyPractice;

import java.util.Scanner;

public class PalindromPattern {

  public static void main(String[] args) {
    System.out.print("Enter the number of line:");
    Scanner input8 = new Scanner(System.in);
    int n = input8.nextInt();
    input8.close();
    for (int i = 1; i <= n; i++) {
      for (int j = n - 1; j >= i; j--) {
        System.out.print(" ");
      }
      for (int k = i; k >= 1; k--) {
        System.out.print(k);
      }
      for (int k = 2; k <= i; k++) {
        System.out.print(k);
      }
      System.out.println();
    }
  }
}
