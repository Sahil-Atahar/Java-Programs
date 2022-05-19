package Problem;

import java.util.Scanner;

public class Main6 {

  public static void main(String[] args) {
    System.out.print("How many element you want to enter? : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.print("Enter " + n + " Elements: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
    
    System.out.println("\nElement of array are: ");
    for (int i = 0; i < n; i++) {
      System.out.println(arr[i]);
    }
    for(int i = 0; i < arr.length/2; i++) {
      int temp = arr[i];
      arr[i] = arr[arr.length - i -1];
      arr[arr.length - i -1] = temp;
     
    }
    System.out.println("\nReverse Element of array are: ");
    for (int i = 0; i < n; i++) {
      System.out.println(arr[i]);
    }
  }
}
