package Problem;

import java.util.Scanner;

public class Cylinder {
  final double pi = 3.14159;

  public void printVolume(double redius, double height) {
    double volume = pi * redius * redius * height;
    System.out.printf("Volume of cylinder is: %.3f", volume);
  }

  public static void main(String[] args) {
    System.out.print("Enter the value of redius and height: ");
    Scanner input = new Scanner(System.in);
    double redius = input.nextDouble();
    double height = input.nextDouble();
    input.close();

    Cylinder C = new Cylinder();

    C.printVolume(redius, height);
  }
}
