/*This program will print all the possible permutation of the given string.
Caution - Don't use long string it will your mobile.
*/
package MyPractice;

import java.util.Scanner;

public class PrintAllPossiblePermutation {

  public static void printAllPossible(String str, String Possible) {
    if (str.length() == 0) {
      System.out.println(Possible);
    }
    for (int i = 0; i < str.length(); i++) {
      char currentPosition = str.charAt(i);
      String newStr = str.substring(0, i) + str.substring(i + 1);
      printAllPossible(newStr, Possible + currentPosition);
    }
  }

  public static void main(String[] args) {
    System.out.print("Enter the String[Not more than 5 or 6 latters]: ");
    Scanner input = new Scanner(System.in);
    String str = input.nextLine();
    input.close();
    printAllPossible(str, "");
  }
}
