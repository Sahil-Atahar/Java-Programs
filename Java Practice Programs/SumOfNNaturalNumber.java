package MyPractice;

import java.util.Scanner;


public class SumOfNNaturalNumber {

  public static void main(String[] args) {
	int Sum=0;
  System.out.print("Enter the number: ");
  Scanner input = new Scanner(System.in);
  int n = input.nextInt();
  input.close();
  for(int i=n;i>=1;i--){
     Sum+=i;
  }
  System.out.println("Sum of "+n+" Natural number is :"+Sum);
  }

}
