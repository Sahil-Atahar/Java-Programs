//Program to calculate Area and Parameter of Rectangle.
package MyPractice;

import MyPractice.Rectangle;
import java.util.Scanner;

class Rectangle {
  float L, B, A, P;

  Rectangle() {
    System.out.print("Enter the Length of Rectangle: ");
    Scanner input4 = new Scanner(System.in);
    this.L = input4.nextFloat();
    input4.close();
    System.out.print("Enter the Base of Rectangle : ");
    Scanner input5 = new Scanner(System.in);
    this.B = input5.nextFloat();
    input5.close();
  }

  float Area() {
     this.A = this.L * this.B;
     return this.A;
  }
  float Parameter(){
      this.P = 2 * (this.L + this.B);
      return this.P;
  }
}

public class AreaAndParameterOfRectangle {

  public static void main(String[] args) {

   
  Rectangle R = new Rectangle();
    System.out.println("Area of rectangle is: " + R.Area());
    System.out.print("Perimeter of ractangle is: " + R.Parameter());
  }
}
