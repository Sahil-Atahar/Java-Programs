package MyPractice;
import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.print("Enter the first number: ");
  int num1 = in.nextInt();
  System.out.print("Enter the second number: ");
  int num2 = in.nextInt();
  in.close();
  if(num1 > num2) {
    System.out.println("");
  }
  }

}
