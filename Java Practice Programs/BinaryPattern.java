/*Program to print this type of pateern:
1
11
101
1001
10001
100001
1000001      */

package MyPractice;

import java.util.Scanner;

public class BinaryPattern {

  public static void main(String[] args) {
  System.out.print("Enter the nunber of line: ");
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  sc.close();
  for(int i = 1 ; i <= n ; i++){
    for(int j = 1 ; j <= i ; j++){
      if(j == 1 || j == i ){
        System.out.print("1");
      }
      else{
        System.out.print("0");
      }
    }
    	System.out.println();
  }
  }
}
