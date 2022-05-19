package Problem;

import java.util.Scanner;

public class Pattern3 {

  public static void main(String[] args) {
    System.out.print("Enter the number of rows: ");
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    sc.close();
    for (int i = 1; i <= row / 2; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i = row/2 -1; i >=11; i--) {
    for (int k = 0; k < i; k++) {
        System.out.print(" ");
      }
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    
  }
}
