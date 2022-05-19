package Problem;

import java.util.Scanner;

public class Main4 {

  public static void main(String[] args) {
    System.out.print("How many elements you want to enter? : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.print("Enter " + n + " Elements: ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
      sc.close();
    }

    for (int i = 0; i < arr.length; i++) {
      int count = 1;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          count++;
        }
      }
      if (count == 1) {
        System.out.println("Element[" + i + "]: " + arr[i]);
      } else {
        System.out.println("Element[" + i + "]: " + arr[i] + " (at " + count + " place)");
      }
    }
  }
}
