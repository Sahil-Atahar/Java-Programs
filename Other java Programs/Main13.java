package Problem;

import java.util.Scanner;

public class Main13 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the sentence: ");
    String sentence = input.nextLine();
    System.out.print("Enter the letter: ");
    char c = input.next().charAt(0);
    input.close();
    int i;
    for (i = 0; i < sentence.length(); i++) { // for loop to check all char one by one.
      if (c == sentence.charAt(i)) { // if condition will be true this statement will be execute.
        System.out.print("Output: ");
        for (int j = i + 1;
            j < sentence.length();
            j++) { // loop to print all char after coming that letter.
          System.out.print(sentence.charAt(j));
        }
        break; // after printing char we will jump out of outer loop.
      }
    }
    if (i == sentence.length()) {
      /* if , if statement's condition will not be true then value of i will be equal to sentence length. it means letter does not exist in sentence. */
      System.out.print("Output: Letter does not exist in sentence.");
    }
  }
}