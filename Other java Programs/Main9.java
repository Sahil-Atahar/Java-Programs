package Problem;

import java.util.Scanner;

public class Main9 {

  public static void main(String[] args) {
    System.out.print("Enter the fee and no of brothers: ");
    Scanner sc = new Scanner(System. in);
    float fee = sc.nextFloat();
    int noOfBrothers = sc.nextInt();
    sc.close();
    
    int r = 0;
    if (noOfBrothers == 2) {
      r = 10;
    } else if (noOfBrothers == 3) {
      r = 20;
    }
    float discount = fee * r / 100;

    System.out.println("The discount amount is: " + discount);
    System.out.println("The final fee is: " + (fee - discount));
  }
}
