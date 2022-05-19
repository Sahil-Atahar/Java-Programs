/*Program to print this type of pateern:
6
56
456
3456
23456
123456     */

package MyPractice;

import java.util.Scanner;

public class PrintPattern2 {

  public static void main(String[] args) {
    System.out.print("Enter the nunber of line: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    for (int i = n; i >= 1; i--) {
      for (int j = i; j <= n; j++) {
       System.out.print(j);
      }
      System.out.println();
    }
  }
}
