package Problem;

import java.util.Scanner;

public class Main14 {

  public static void main(String[] args) {

    System.out.print("Enter the number: ");
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    input.close();

    while (true) {
      num++;
      if (num % 7 == 0 || num % 10 == 7) {
        System.out.println("Next number is: " + num);
        break;
      }
    }
  }
}
