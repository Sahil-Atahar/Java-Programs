/* Write a program to print non repeating characters in a string?  */
package Problem;

import java.util.Scanner;

public class Main10 {

  public static void main(String[] args) {
    System.out.print("Enter the string: ");
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    sc.close();
    String nRC = " ";
    boolean rON = false;
    for (int i = 0; i < str.length(); i++) {
      rON = false;
      for (int j = 0; j < str.length(); j++) {
        if (i == j) continue;

        if (str.charAt(i) == str.charAt(j)) {
          System.out.println(str.charAt(i) + " " + str.charAt(j));
          rON = true;
          break;
        }
      }
      if (rON == false) {
        nRC = nRC + str.charAt(i) + " ";
      }
    }
    System.out.print("Non repeating characters are: " + nRC);
  }
}
