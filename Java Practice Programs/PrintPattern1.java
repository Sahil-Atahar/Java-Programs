/*Program to print this type of pateern:
1
12
123
1234
12345
123456      */

package MyPractice;

import java.util.Scanner;

public class PrintPattern1 {

  public static void main(String[] args) {
    System.out.print("Enter the nunber of line: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
       System.out.print(j);
      }
      System.out.println();
    }
  }
}
