package Problem;

import java.util.Scanner;
import java.util.Random;

class Account1 {
  int id;
  double balance;

  public Account1() {
    Random R = new Random();
    id = R.nextInt(200);
    this.balance = 0;
  }

  public void showOption() {
    System.out.print(
        "\nChoose an option: \n[1] Display Amount. \n[2] Withdraw Amount. \n[3] Deposit Amount.  \n[4] Exit. \n\nEnter Choice: ");
    Scanner in = new Scanner(System. in);
    int option = in.nextInt();
    in.close();

    switch (option) {
      case 1:
        displayAccount();
        break;
      case 2:
        withdraw();
        break;
      case 3:
        deposit();
        break;
      case 4:
        System.exit(0);
    }
  }

  public void displayAccount() {
    System.out.println("\n-----------Customer Info-----------\n");
    System.out.println("Costomer ID  : " + id);
    System.out.println("Total Balance: " + balance);
    showOption();
  }

  public void withdraw() {
    System.out.println("\n----------Withdraw Amount----------\n");
    System.out.print("Enter the withdraw amount: ");
    Scanner sc = new Scanner(System. in);
    double withdrawAmount = sc.nextDouble();
    sc.close();
    if (withdrawAmount > balance) {
      System.out.println("Insufficiant Amount\n");
    } else {
      balance = balance - withdrawAmount;
    }
    displayAccount();
  }

  public void deposit() {
    System.out.println("\n----------Deposit Amount--------\n");
    System.out.print("Enter the deposit amount: ");
    Scanner sc = new Scanner(System. in);
    double depositAmount = sc.nextDouble();
    sc.close();
    balance = balance + depositAmount;
    System.out.println();
    displayAccount();
  }
}

public class TestAccount {

  public static void main(String[] args) {
    Account1 A = new Account1();
    A.showOption();
  }
}
