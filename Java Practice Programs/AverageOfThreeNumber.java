package MyPractice;

import java.util.Scanner;

public class AverageOfThreeNumber {

  public static float Avg(int n1, int n2, int n3) {
    float avg = (float) (n1 + n2 + n3) / 3;
    return avg;
  }

  public static void main(String[] args) {
    System.out.print("Enter the three number: ");
    Scanner input = new Scanner(System.in);
    int n1 = input.nextInt();
    int n2 = input.nextInt();
    int n3 = input.nextInt();
    input.close();
    System.out.format("Average of %d,%d & %d is %.2f", n1, n2, n3, Avg(n1, n2, n3));
  }
}
