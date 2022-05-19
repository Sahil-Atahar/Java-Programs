package MyPractice;

import java.util.Scanner;

public class Dinomination {
  int A, R, No;
  int Note[] = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

  public void DinominateAmount(int amount) {
    while (amount != 0) {
      for (int j = 0; j < Note.length; j++) {
        No = amount / Note[j];
        amount = amount % Note[j];
        A = Note[j] * No;
        if (R == 0 && No !=0 ) {
          System.out.printf("%4d X %2d = %d \n", Note[j], No, A);
        }
      }
    }
  }

  public static void main(String[] args) {
  System.out.print("Enter the number: ");
  Scanner input = new Scanner(System.in);
  int amount = input.nextInt();
  input.close();
    Dinomination D = new Dinomination();
    D.DinominateAmount(amount);
  }
}
