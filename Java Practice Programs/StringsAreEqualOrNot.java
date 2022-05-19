// Program to check whether two string entered by user are equal or not.
package MyPractice;
import java.util.Scanner;
public class StringsAreEqualOrNot {

  public static void main(String[] args) {
    System.out.print("Enter the First String: ");
    Scanner sc = new Scanner(System.in);
    String firstStr = sc.nextLine();
    System.out.print("Enter the Second String: ");
    Scanner sc2 = new Scanner(System.in);
    String secondStr = sc2.nextLine();
    sc.close();
    sc2.close();
    if (firstStr.compareTo(secondStr) == 0) {
      System.out.print("Strings are Same.");
    } else {
      System.out.print("Strings are Not Same.");
    }
  }
}
