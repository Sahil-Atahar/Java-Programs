package Problem;

public class Main7 {
  String studentName; // declare a String studentName.

  public Main7(String studentName) { // set the value using constructor.
    this.studentName =
        studentName; /* you can see here two strings and both string's name are same. to tell the compiler that store the studentName which  is declare in constructor into this.studentName string. this tell that the attribute(studentName) of the class which is declar in class and out of constructor.
                      */
  }

  public String getStudentName() { // method to the student name.
    return this.studentName; // return the studentName which is declare in the same class.
  }

  public static void main(String[] args) {

    String name = "Akshay"; // delayer a string and initialize the string.
    Main7 obj = new Main7(name); // making object of main class.

    System.out.println(
        "Student Name is: "
            + obj.getStudentName()); // printing the student name by calling GETSTUDENTNAME method.
  }
}
