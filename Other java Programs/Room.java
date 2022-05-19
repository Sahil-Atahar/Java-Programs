/*
Write a program to create a room class, the attributes of this class is roomno, roomtype, roomarea and ACmachine. In this class the member functions are setdata and displaydata.

Someone to help me with it pls
*/

package Problem;

import java.util.Scanner;

public class Room {
  int roomNo;
  String roomType;
  String roomArea;
  String acMachine;

  public void setData(int no, String type, String area, String ac) {
    this.roomNo = no;
    this.roomType = type;
    this.roomArea = area;
    this.acMachine = ac;
  }

  public void displayData() {
    System.out.println("\n-----Room Information-----");
    System.out.println("Room No: " + roomNo);
    System.out.println("Room Type: " + roomType);
    System.out.println("Room Area: " + roomArea);
    System.out.println("AC Machine facility: " + acMachine);
  }

  public static void main(String[] args) {
    System.out.print("Enter the room no: ");
    Scanner sc = new Scanner(System.in);
    int roomNo = sc.nextInt();
    sc.nextLine();
    System.out.print("Enter the room type: ");
    String roomType = sc.nextLine();
    System.out.print("Enter the room area: ");
    String roomArea = sc.nextLine();
    System.out.print("Do you want AC room: ");
    String acMatchine = sc.nextLine();
    sc.close();

    Room R = new Room();
    R.setData(roomNo, roomType, roomArea, acMatchine);
    R.displayData();
  }
}
