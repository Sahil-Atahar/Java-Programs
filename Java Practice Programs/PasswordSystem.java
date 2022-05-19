package MyPractice;

import java.util.Scanner;

public class PasswordSystem {
  public void Login(){
  System.out.print("Enter the Password: ");
  Scanner input = new Scanner(System.in);
  String Pass = input.nextLine();
  input.close();
  if(Pass.compareTo("Sahil Atahar") == 0){
    System.out.print("Login Success.");
  }
  else{
    System.out.print("Wrong Password");
  }
  }

  public static void main(String[] args) {
  PasswordSystem obj = new PasswordSystem();
  obj.Login();
  }

}
