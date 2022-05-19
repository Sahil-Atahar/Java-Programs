package Problem;

import java.util.Scanner;

public class Main8 {

  public static void startEatingProcess(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[i]) {
          arr[i] = arr[i] + arr[j];
          for (int k = j; k < arr.length; k++) {
            arr[j] = arr[j - 1];
          }
        }
      }
    }
    int monsterNumber = 0;
    for (int i = 0; i < arr.length; i++) {
      if (monsterNumber < arr[i]) monsterNumber = arr[i];
    }
    System.out.println("Monster number is: " + monsterNumber);
  }

  public static void main(String[] args) {

    System.out.print("How many Number you want to enter?: ");
    Scanner sc = new Scanner(System. in);
    int n = sc.nextInt();

    int[] arr = new int[n];

    System.out.print("Enter " + n + " Numbers: ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
    startEatingProcess(arr);
  }
}
