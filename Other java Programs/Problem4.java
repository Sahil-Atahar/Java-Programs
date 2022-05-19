/* sample input : 1234
output 1234 , 2341, 3412, 4123   */
package Problem;

import java.util.Scanner;

public class Problem4 {

  public static int countDigits(int n) { // method to count and return the number of digit.
    int count = 0;
    while (n != 0) {
      n = n / 10;
      count++;
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.print("Enter the number: ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    sc.close();

    int r;
    int num2 = num;
    for (int i = 0; i < countDigits(num); i++) {
      r = num2 % 10;
      num2 = num2 / 10;
      num2 = r * ((int) Math.pow(10, countDigits(num) - 1)) + num2;
      System.out.println(num2);
    }
  }
}
