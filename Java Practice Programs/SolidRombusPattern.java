package MyPractice;

import java.util.Scanner;
public class SolidRombusPattern {

  public static void main(String[] args) {
    System.out.print("Enter the number of line:");
    Scanner input8 = new Scanner(System.in);
    int n = input8.nextInt();
    input8.close();
    for(int j=1;j<=n ; j++){
    for(int i=n-1 ; i>=j ; i--){
      System.out.print(" ");
    }
      for(int k=1;k<=n;k++){
      System.out.print("*");
      }
      System.out.println();
    }
  }
}
