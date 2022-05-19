package Problem;

import java.util.Scanner; // importing the Scanner class.
public class DiamondPattern {  // creating a class DiamondPattern.

  public static void main(String[] args) { // this is main the method.
  System.out.print("Enter the number of lines: ");
  Scanner sc = new Scanner(System.in); //making an object of Scanner class.
  int n = sc.nextInt();  //taking user input.
  sc.close();
 
  for(int i = 1; i<= n; i++) {  // outer for loop
    for(int k = 1; k <= n-i; k++) {  // inner for loop to print only spaces.
      System.out.print(" ");
    }
    for(int j = 1; j <= i; j++) { // inner for loop to print stars.
      System.out.print("*");
      } 
      
    for(int j = 2; j <= i; j++) { // another for loop to print stars.
      System.out.print("*");
    } 
    System.out.println(); // after printing spaces and star go to new line.
  }
  
  
  for(int i = n-1; i >=1; i--) { // this is only reverse for loopr of upper for loop. 
    for(int k = 1; k <= n-i; k++) {
      System.out.print(" ");
    }
    for(int j = 1; j <= i; j++) {
      System.out.print("*");
    } for(int j = 2; j <= i; j++) {
      System.out.print("*");
    }
    System.out.println();
  }

  }

}
