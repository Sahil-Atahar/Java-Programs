/* Program to print only palindrom word from the sentence entered by user. */
package Problem;

import java.util.ArrayList;
import java.util.Scanner;

class Main {

  static boolean isPalindrome(String str) {

    int i = 0, j = str.length() - 1;
    while (i < j) {
      if (str.charAt(i) != str.charAt(j)) return false;
      i++;
      j--;
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.print("Enter your sentence: ");
    Scanner input = new Scanner(System.in);
    String sentence = input.nextLine();
    input.close();
    sentence = sentence.toUpperCase();
    ArrayList<String> senArray = new ArrayList<String>();
    for (int i = 0; i < sentence.length(); i++) {
      String word = "";
      for (int j = i; j < sentence.length(); j++) {
        if (sentence.charAt(j) == ' ') {
          break;
        } else if (sentence.charAt(j) != ' ') {
          word = word + sentence.charAt(j);
        }
        i = j;
      }
      if (!word.equals("")) {
        senArray.add(word);
      }
    }
    for (int i = 0; i < senArray.size(); i++) {
      if (isPalindrome(senArray.get(i))) {
        System.out.print(senArray.get(i).toLowerCase() + " ");
      }
    }
  }
}
