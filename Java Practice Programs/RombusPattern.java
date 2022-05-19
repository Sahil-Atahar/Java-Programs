package MyPractice;

import java.util.Scanner;
public class RombusPattern {

  public static void main(String[] args) {
    System.out.print("Enter the number of line:");
    Scanner input9 = new Scanner(System.in);
    int n = input9.nextInt();
    input9.close();
    for (int i = 1; i <= n; i++) {
      for (int j = n - 1; j >= i; j--) {
        System.out.print(" ");
      }
      for(int k=1;k<=i;k++){
        System.out.print("*");
      } 
      for(int k=2;k<=i;k++){
        System.out.print("*");
      }
      System.out.println();
    }
    //Second Part
    for (int i = n-1; i >=1; i--) {
      for (int j = n - 1; j >= i; j--) {
        System.out.print(" ");
      }
      for(int k=1;k<=i;k++){
        System.out.print("*");
      } 
      for(int k=2;k<=i;k++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
