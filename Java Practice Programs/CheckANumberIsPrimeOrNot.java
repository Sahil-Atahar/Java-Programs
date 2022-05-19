//Program to check whether a number is prime or not.
package MyPractice;

import java.util.Scanner;


public class CheckANumberIsPrimeOrNot {

  public static void main(String[] args) {
  int n,i;
  System.out.print("Enter a number : ");
  Scanner input = new Scanner(System.in);
  n = input.nextInt();
  input.close();
  for(i=2;i<=n;i++){
    if(n%i==0){
      break;
    		}
  	}
  if(i==n){
    System.out.println(n+" is a prime number.");
  }
  else{
    System.out.println(n+" is not a prime number.");
  }
  }

}
