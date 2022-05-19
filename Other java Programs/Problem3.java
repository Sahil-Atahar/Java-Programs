package Problem;

import java.util.Scanner;

public class Problem3 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the amount and the action W for withdraw and A for add: ");
    int number = sc.nextInt();
    char ch = sc.next().charAt(0);
    sc.close();
    
    int temp = (number * 6) / 100;

    if (ch == 'A' || ch == 'a') {
      System.out.println("Add: " + temp);
      System.out.println("Your amount is: " + (number + temp));
    } else if (ch == 'W' || ch == 'w') {
      System.out.println("Withdraw: " + temp);
      System.out.println("Your amount is " + (number - temp));
    }
  }
}
