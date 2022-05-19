package MyPractice;

import java.util.Scanner;

public class AdvancePattern1 {

  public static void main(String[] args) {
    System.out.print("Enter the number of line:");
    Scanner input7 = new Scanner(System.in);
    int n = input7.nextInt();
    input7.close();
    for (int i = 1; i <= n - 1; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      for (int k = n - 1; k > i; k--) {
        System.out.print("  ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }
    
    for (int i = n-1; i >=1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      for (int k = n - 1; k > i; k--) {
        System.out.print("  ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}
