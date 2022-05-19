//Program to print sum of all Odd number in a give Range.

package MyPractice;

import java.util.Scanner;

public class SumOfAllOddNumber {

public static int SumOfOdd(int n){
	int sum=0;
for(int i=1;i<=n;i=i+2){
	  sum+=i;
			}
	 return sum;
	}

  public static void main(String[] args) {
  System.out.print("Enter the number: ");
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  sc.close();
  System.out.print("Sum of all Odd numbers between 1 to "+ n +" is : "+ SumOfOdd(n));
  }
}
