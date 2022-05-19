package MyPractice;

import java.util.Scanner;
public class AverageOfNNaturalNumber {

  public static void main(String[] args) {
	int Sum=0;
	float Avg;
  System.out.print("Enter the number: ");
  Scanner input = new Scanner(System.in);
  int n = input.nextInt();
  input.close();
  for(int i=n;i>=1;i--){
     Sum+=i;
  }
  Avg=(float)Sum/n;
  System.out.println("Average of "+n+" Natural number is :"+Avg);
  
  }

}
