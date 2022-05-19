//Not an Important problem.
package Problem;

import java.util.Scanner;

interface StudentData {
  String getName();

  void setName(String name);

  String getCourseName();

  void setCourseName(String courseName);

  int getAge();

  void setAge(int age);
}

public class Main2 implements StudentData {
  private String name;
  private int age;
  private String courseName;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }

  public String getCourseName() {
    return courseName;
  }

  public static void main(String[] args) {
    Main2 obj = new Main2();
    System.out.print("Enter the name of student: ");
    Scanner sc = new Scanner(System.in);
    obj.setName(sc.nextLine());
    System.out.print("Enter your age: ");
    obj.setAge(sc.nextInt());
    sc.nextLine();
    System.out.print("Enter your course name: ");
    obj.setCourseName(sc.nextLine());
    sc.close();

    System.out.println();

    System.out.println("Name: " + obj.getName());
    System.out.println("Age: " + obj.getAge());
    
    System.out.print("Course Name: " + obj.getCourseName());
  }
}
