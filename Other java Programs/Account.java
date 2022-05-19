package Problem;

import java.util.Scanner; // importing the Scanner class to take input.

class Customer { // create a class which name is Customer.
  String customerName, customerAddress;

  public void setCustomerDetails() { // create an method to to take customer details.
    System.out.print("Enter the customer name: ");
    Scanner in = new Scanner(System.in);
    customerName = in.nextLine();
    System.out.print("Enter customer address: ");
    customerAddress = in.nextLine();
    in.close();
  }
}

public class Account
    extends Customer { // create a class which name is Account and also inherit the Customer class.
  long phoneNo;
  int rechargePrice;

  public void setAccountDetails() { // method to take Customer Account details.
    System.out.print("Enter the Phone No: ");
    Scanner in = new Scanner(System.in);
    phoneNo = in.nextLong();
    System.out.print("Enter the Recharge Price: ");
    rechargePrice = in.nextInt();
    in.close();
  }

  public void rechargeSuccessfull() { // method to display customer details and recharge status.
    System.out.println("\n----------Customer details----------");
    System.out.println("Name: " + customerName);
    System.out.println("Address: " + customerAddress);
    System.out.println("Phone No: " + phoneNo);
    System.out.println("Recharge Price: " + rechargePrice);
    System.out.println("Recharge status: Successfull");
  }

  public static void main(String[] args) {

    Account A = new Account(); // making an object of class Account.
    A
        .setCustomerDetails(); /* calling the setCustomerDetails to take cuatomer details. Account class extends the Customer class so setCustomerDetails function also exists in Account class.     */
    A.setAccountDetails(); // calling the method to take Accou nt Details.
    A.rechargeSuccessfull(); // calling the method to print Customer details and recharge Status.
  }
}
