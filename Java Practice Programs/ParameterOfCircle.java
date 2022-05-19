// Program to calculate the circumference of circle.
package MyPractice;

import java.util.Scanner;

public class ParameterOfCircle {
  static final float pi = 3.14f;

  public static void POfCircle(float r) {
    float parameter = 2 * pi * r;
    System.out.println("Parameter of circle is: " + parameter);
  }

  public static void main(String[] args) {
    System.out.print("Enter the redius of circle: ");
    Scanner in = new Scanner(System.in);
    float r = in.nextFloat();
    in.close();
    POfCircle(r);
  }
}
