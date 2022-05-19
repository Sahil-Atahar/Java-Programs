package Problem;

import java.util.Scanner;

public class Problem1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the redius of hemisphare: ");
    double r = sc.nextDouble();
    sc.close();
    double volume = (double) 3.14159 * r * r * r * 2 / 3;
    System.out.print("The volume of the hemisphare is: " + volume);
  }
}
