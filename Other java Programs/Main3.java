/*
Scenario

Think we are designing a software for a School. First we have identified one major class called “Student” to represent each student in our program.

Tasks

Develop a simple JAVA program by following the below steps. (When creating identifiers and methods use the names which are given in the brackets and inverted commas).

1. Create the class “Student” with attributes or properties-student name(studentName), studentAge(studentAge), student’s parent’s phone number(parentTelNo), store true or false if admission fee was paid or not (isAdmissionFeePaid), gender(studentGender) as ‘M’ for male or ‘F’ for female and finally the library fee(libraryFee). (Use the most matching data types).

 Admission fees(admissionFee) is a common attribute to all the students, and it is fixed at Rs.255.00 per student. Create a class/static variable to store this value considering it is final and common to every “Student” object.
 Create a constructor to assign the student’s name and the student age at the time the object is created.
 Create setter methods for all the instance variables except for “studentName” and “studentAge”.
 Create getter methods for all the instance variables.
 “displayStudentDetails()” is an instance method used to display the student details. Create this method to print the details according to this format:
Student : <getStudentName()>

Age  <getStudentAge()>

Parent Phone No : <getParentTelNo()>

Is Admission Fee Paid : <getIsAdmissionFeePaid()>

Gender : <getStudentGender()>

Library Fee : Rs. <getLibraryFee()>

---------



(Don't add “<” or “>” in the output. They are markers used for the variables’ getter methods)


     7.   “calculateLibraryFee” is a static method that is used to calculate and return the library fee student have to pay.

calculateLibraryFee(studentAge)” - returns the library fee by multiplying the given parameter student’s age and the common “admissionFee” value.

( Library Fee = studentAge * admissionFee)



The “Student” class is ok. Now,

8.     Create another class in the same java source file (name this class exactly as your file name) with the main method and create one “Student” object.

Assign the student’s name as your LMS name and student age as your age.

9.     Then set the other remaining details of the student to any suitable values. Don’t assign a value to “libraryFee”.

10.  Then use the class method “calculateLibraryFee” to get the library fee of the student by using the above assigned “studentAge” variable of the student object. Then assign that returned value to the “libraryFee” of the “Student” object.

11.  Finally call the “displayStudentDetails()” method to see the details of the student.



-------------------------------END-----------------------------------
*/

package Problem;

import java.util.Scanner; // --> importing the Scanner class.

class Student {
  // we make a Student class and his all attribute and methods.
  String studentName;
  int studentAge;
  int admissionFee;
  int libraryFee;
  long phoneNo;
  char studentGender;

  public Student(
      String name,
      int age,
      int admissionFee,
      long phoneNo,
      char gender) { // --> constructor to fill information.
    this.studentName = name;
    this.studentAge = age;
    this.admissionFee = admissionFee;
    this.libraryFee = admissionFee * age;
    this.phoneNo = phoneNo;
    this.studentGender = gender;
  }

  public String getStudentName() { // --> method to  get studentName.
    return studentName;
  }

  public int getStudentAge() { // --> method to get student age.
    return studentAge;
  }

  public boolean
      isAdmissionFeePaid() { // -->method to check is admission fee paid? it returns true if total
                             // fee(Rs.255) or more than total submitted.
    boolean isPaid = false;
    if (this.admissionFee >= 255) {
      isPaid = true;
    }
    return isPaid;
  }

  public boolean isLibraryFeePaid() { // --> mothod to check is total library fee paid.
    boolean isPaid = false;
    if (libraryFee >= 255 * studentAge) {
      isPaid = true;
    }
    return isPaid;
  }

  public long getPhoneNo() { // --> method to get phone no means it returns phone no.
    return phoneNo;
  }

  public char getStudentGender() { // --> method to get student gender.
    return studentGender;
  }

  public void displayStudentDetails() { // -->method to display(show) student full information.
    System.out.println("\n------------Show Student Details------------");
    System.out.println("Student Name: " + getStudentName());
    System.out.println("Student Age : " + getStudentAge());
    System.out.println("Student Gender: " + getStudentGender());
    System.out.println("Phone No: " + getPhoneNo());
    System.out.println("Admission Fee Status: " + isAdmissionFeePaid());
    System.out.println("Library Fee Status: " + isLibraryFeePaid());
  }
}

public class Main3 {

  public static void main(String[] args) {
    System.out.println("---------Fill Student Details---------");
    // --> taking student information as input by user and scanning using Scanner class.
    Scanner sc = new Scanner(System.in);
    System.out.print("Student Name: ");
    String studentName = sc.nextLine();
    System.out.print("Student Age: ");
    int studentAge = sc.nextInt();
    System.out.print("Student Gender[M/F]: ");
    char studentGender = sc.next().charAt(0);
    System.out.print("Admission Fee(Rs.255): ");
    int admissionFee = sc.nextInt();
    System.out.print("Phone No: ");
    long phoneNo = sc.nextLong();
    sc.close();

    Student s = new Student(studentName, studentAge, admissionFee, phoneNo, studentGender);
    /* --> making an object(which name is s) of Student class by putting information to set information for this object.    */
    s
        .displayStudentDetails(); // --> calling displayStudentDetails function to display student
                                  // details.
  }
}
