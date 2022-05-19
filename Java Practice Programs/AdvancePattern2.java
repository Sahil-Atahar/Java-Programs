package MyPractice;

import java.util.Scanner;
public class AdvancePattern2 {

  public static void main(String[] args) {

    System.out.print("Enter the number of line:");
    Scanner input9 = new Scanner(System.in);
    int n = input9.nextInt();
    input9.close();
    for(int j=1;j<=n ; j++){
    for(int i=n-1 ; i>=j ; i--){
      System.out.print(" ");
    }
    for(int k=1;k<=j;k++){
      System.out.print(j+" ");
    }
    System.out.println();
    }
  }
}
