//Program to Find GCD(HCF) of two numbers.
package MyPractice;

import java.util.Scanner;


public class FindGCDofANumber {
  static int GCD(int n1, int n2) {
    int gcd=0, i;
    for (i = 1; i <= n1 && i <= n2; i++) {
      if (n1 % i == 0 && n2 % i == 0) {
        gcd = i;
      }
    }
  		return gcd;}

  public static void main(String[] args) {
    System.out.print("Enter two numbers: ");
    Scanner in = new Scanner(System.in);
    int n1 = in.nextInt();
    int n2 = in.nextInt();
    in.close();
    System.out.print("GCD of "+n1+" and "+n2+" is "+GCD(n1,n2)+".");
  }
}
