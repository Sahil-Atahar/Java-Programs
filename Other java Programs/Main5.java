/* Create a class, named “Shape”. Data members as area and perimeter.  Write function members to findArea() and findPerimeter() with empty  body, printValues() function to print the area and perimeter. Inherit  classes called “circle”, “rectangle”, “triangle”, “square” from this. Define  whatever data members are required in each of these classes. And  override the functions findArea() and findPerimeter().

*/

package Problem;

import java.util.Scanner;

interface Shape {

  double findArea();

  double findPerimeter();

  void printValues();
}

class Circle implements Shape {
  double area, perimeter, redius;
  final double PI = 3.14;

  public Circle() {
    System.out.print("\nEnter the value of redius: ");
    Scanner sc = new Scanner(System. in);
    this.redius = sc.nextDouble();
    sc.close();
  }

  public double findArea() {
    area = redius * redius * PI;
    return area;
  }

  public double findPerimeter() {
    perimeter = 2 * PI * redius;
    return perimeter;
  }

  public void printValues() {
    System.out.println("\nArea of circle is :" + findArea());
    System.out.println("Perimeter of circle is: " + findPerimeter());
  }
}

class Triangle implements Shape {
  double area, perimeter, height, base, side1, side2;

  public Triangle() {
    System.out.print("\nEnter the value of base: ");
    Scanner sc = new Scanner(System. in);
    this.base = sc.nextDouble();
    System.out.print("Enter the value of height: ");
    this.height = sc.nextDouble();
    sc.close();
    System.out.print("Enter the value of other two sides: ");
  }

  public double findArea() {
    area = (base * height) / 2;
    return area;
  }

  public double findPerimeter() {
    perimeter = side1 + side2 + base;
    return perimeter;
  }

  public void printValues() {
    System.out.println("\nArea of triangle is :" + findArea());
    System.out.println("Perimeter of triangle is: " + findPerimeter());
  }
}

class Rectangle implements Shape {
  double length, breath, area, perimeter;

  public Rectangle() {
    System.out.print("\nEnter the value of length: ");
    Scanner sc = new Scanner(System. in);
    this.length = sc.nextDouble();
    System.out.print("Enter the value of breath:");
    this.breath = sc.nextDouble();
    sc.close();
  }

  public double findArea() {
    area = length * breath;
    return area;
  }

  public double findPerimeter() {
    perimeter = 2 * (length + breath);
    return perimeter;
  }

  public void printValues() {
    System.out.println("\nArea of rectangle is: " + findArea());
    System.out.println("Perimeter of rectangle is: " + findPerimeter());
  }
}

class Square implements Shape {
  double side, area, perimeter;

  public Square() {
    System.out.print("\nEnter the value of side: ");
    Scanner sc = new Scanner(System. in);
    this.side = sc.nextDouble();
    sc.close();
  }

  public double findArea() {
    area = side * side;
    return area;
  }

  public double findPerimeter() {
    perimeter = 4 * side;
    return perimeter;
  }

  public void printValues() {
    System.out.println("\nArea of square is: " + findArea());
    System.out.println("Perimeter of square is: " + findPerimeter());
  }
}

public class Main5 {

  public static void main(String[] args) {
    System.out.print(
        "Choose an option: \n[1] Circle. \n[2] Triangle. \n[3] Rectangle. \n[4] Square. \nYour choice: ");
    Scanner sc = new Scanner(System. in);
    int input = sc.nextInt();
    sc.close();
    switch (input) {
      case 1:
        Circle C = new Circle();
        C.printValues();
        break;
      case 2:
        Triangle T = new Triangle();
        T.printValues();
        break;
      case 3:
        Rectangle R = new Rectangle();
        R.printValues();
        break;
      case 4:
        Square S = new Square();
        S.printValues();
        break;
      default:
        System.out.print("Wrong choice entered.");
    }
  }
}
