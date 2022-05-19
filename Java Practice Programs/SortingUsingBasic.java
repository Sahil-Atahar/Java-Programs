// Program to arrenge an Arrey in Ascending order.
package MyPractice;

import java.util.Scanner;

public class SortingUsingBasic {

  public static void main(String[] args) {
    System.out.print("Enter the length of Array: ");
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] Number = new int[n];
    System.out.print("Enter the Elements: ");
    for (int i = 0; i < n; i++) {
      Number[i] = in.nextInt();
    }
    in.close();
    for (int i = 0; i < Number.length; i++) {
      for (int j = 0; j < i; j++) {
        if (Number[i] < Number[j]) {
          Number[i] = Number[i] + Number[j];
          Number[j] = Number[i] - Number[j];
          Number[i] = Number[i] - Number[j];
        }
      }
    }
    for (int i = 0; i < Number.length; i++) {
      System.out.println(Number[i]);
    }
  }
}
