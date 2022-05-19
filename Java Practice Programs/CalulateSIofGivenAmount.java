//Program to calculate the Simple Interest of the iven Amount.
package MyPractice;

import java.util.Scanner;
public class CalulateSIofGivenAmount {

public static void main(String args[]){
float P,R,T,SI;
System.out.print("Enter the Principle Amount: ");
Scanner input1 = new Scanner(System.in);
P = input1.nextFloat();
input1.close();
System.out.print("Enter the Rate: ");
Scanner input2 = new Scanner(System.in);
R = input2.nextFloat();
input2.close();
System.out.print("Enter the Time: ");
Scanner input3 = new Scanner(System.in);
T = input3.nextFloat();
input3.close();
SI = (float)(P*R*T)/100;
System.out.print("Simple Interest is: "+SI);

	}
}
