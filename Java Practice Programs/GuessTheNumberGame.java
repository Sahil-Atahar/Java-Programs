package MyPractice;

import java.util.Random;
import java.util.Scanner;

class Game {
  int RandNum, Num;
  int Count = 0;

  public Game() {
    Random R = new Random();
    RandNum = R.nextInt(100);
  }

  public void Guess() {
    System.out.print("Guess the number: ");
    while (Num != RandNum) {
      Scanner in = new Scanner(System.in);
      Num = in.nextInt();
      in.close();
      IsCorrect(Num);
    }
  }

  public void IsCorrect(int Num) {

    if (this.Num > this.RandNum) {
      System.out.print("Guess some less number: ");
    } else if (this.Num < this.RandNum) {
      System.out.print("Guess some great number: ");
    } else {
      System.out.println("\nCorrect guess.");
    }
    Attempt(this.Num == this.RandNum);
  }

  private void Attempt(boolean b) {
    Count++;
    if (b == true) {
      System.out.println("You guess in " + Count + " attempts.");
      Award();
    }
  }

  private void Award() {
    System.out.print("Please,Enter your name: ");
    Scanner in = new Scanner(System.in);
    String Name = in.nextLine();
    in.close();
    System.out.println("Thanks " + Name + ", To play this game.");
  }
}

public class GuessTheNumberGame {

  public static void main(String[] args) {

    Game g = new Game();
    g.Guess();
  }
}
