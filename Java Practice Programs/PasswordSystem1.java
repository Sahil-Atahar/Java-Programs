package MyPractice;

import java.util.Scanner;

public class PasswordSystem1 {

  public static void main(String[] args) {
    while (true) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the password: ");
      String passwordInput1 = input.nextLine();
      System.out.print("Confirm the password: ");
      String passwordInput2 = input.nextLine();
      input.close();
      if (passwordInput1.equals(passwordInput2)) {
        System.out.print("Correct Password.");
        break;
      } else {
        System.out.println("Tcry again");
      }
    }
  }
}
