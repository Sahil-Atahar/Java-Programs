package Problem;

import java.util.Scanner;

public class A {
  // Method to get Smallest String's length of the array
  private static int getMinLength(String[] word) {
    int minLength = 20;
    for (int i = 0; i < word.length; i++) {
      if (word[i].length() < minLength) {
        minLength = word[i].length();
      }
    }
    return minLength;
  }
  // Program to Arrange in Order.

  public static void arrangeInOrder(int idx, String[] word) {
    while (idx < getMinLength(word)) {
      for (int j = 0; j < word.length; j++) {
        if ((int) word[j].charAt(idx) > (int) word[j].charAt(idx)) {
          String temp = word[idx];
          word[idx] = word[j];
          word[j] = temp;
        } else if ((int) word[j].charAt(idx) == (int) word[j].charAt(idx)) {
          idx++;
        }
      }
    }

    for (int i = 0; i < word.length; i++) {
      System.out.println(word[i]);
    }
  }

  public static void main(String[] args) {

    System.out.print("How many String you want to enter: ");
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    //  String[] word = {"Abc", "cca", "cba"};
    String[] word = new String[n];
    System.out.print("Enter " + n + " strings: ");
    System.out.flush();
    for (int i = 0; i < word.length; i++) {
      word[i] = input.next();
    }
    input.close();
    arrangeInOrder(0, word);
  }
}
