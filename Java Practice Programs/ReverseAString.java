package MyPractice;

import java.util.Scanner;

public class ReverseAString {
  public static void printReverse(String str) {
    int length = str.length();
    char ch;
    String rstr="";
    for (int i = 0; i < length; i++) {
      ch = str.charAt(i);
      rstr = ch + rstr;
    }
    System.out.println(rstr);
  }

  public static void main(String[] args) {
    System.out.print("Enter the string: ");
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    sc.close();
    printReverse(str);
  }
}
