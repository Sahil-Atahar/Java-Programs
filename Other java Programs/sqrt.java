package Problem;

import java.util.Scanner;

public class sqrt {

  public static void main(String[] args) {
    System.out.print("Enter the number: ");
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    in.close();
    System.out.print("Square root of " + num + " is " + Math.sqrt(num));
  }
}
