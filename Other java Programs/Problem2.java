package Problem;

import java.util.Scanner;

public class Problem2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the edge of tetrahedron: ");
    double a = sc.nextDouble();
    sc.close();
    double volume = (double) a*a*a/(6*Math.sqrt(2));
    System.out.print("The volume of the tetrahedron is: " + volume);
  }
}
