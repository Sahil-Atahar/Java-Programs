package MyPractice;

import java.util.Scanner;

public class TicTacTeo {
  int Idx = 0, Value = 1;
  char Num[][] = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
  String[] PlayerName = {"Player 1", "Player 2"};

  public void PlayGame() {
    int Choice;
    SetName();
    Layout();
    while (true) {
      Top1:
      if (IsWon()) {
        System.out.print(PlayerName[0] + ": ");
        Scanner in = new Scanner(System.in);
        Choice = in.nextInt();
        in.close();
        if (IsCorrectChoice(Choice - 1) == true) {
          SetChar(Choice - 1, 'X');
          Layout();
        } else {
          System.out.flush();
          break Top1;
        }
      } else {
        Award(PlayerName[1]);
        break;
      }
      Top2:
      if (IsWon()) {
        System.out.print(PlayerName[1] + ": ");
        Scanner in = new Scanner(System.in);
        Choice = in.nextInt();
        in.close();
        if (IsCorrectChoice(Choice - 1) == true) {
          SetChar(Choice - 1, 'Y');
          Layout();
        } else {
          System.out.flush();
          break Top2;
        }
      } else {
        Award(PlayerName[0]);
        break;
      }
    }
  }

  private void Layout() {

    System.out.println();
    for (int i = 0; i < Num.length; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print("  " + this.Num[i][j] + "  ");
      }
      System.out.println("\n");
    }
  }

  private boolean IsWon() {
    boolean result = false;
    for (int i = 0; i < Num.length; i++) {
      if (this.Num[i][0] == this.Num[i][1] && this.Num[i][1] == this.Num[i][2]) {
        result = false;
        break;
      } else if (this.Num[0][i] == this.Num[1][i] && this.Num[1][i] == this.Num[2][i]) {
        result = false;
        break;
      } else if (this.Num[0][0] == this.Num[1][1] && this.Num[1][1] == this.Num[2][2]) {
        result = false;
        break;
      } else if (this.Num[0][2] == this.Num[1][1] && this.Num[1][1] == this.Num[2][0]) {
        result = false;
        break;
      } else {
        result = true;
      }
    }
    return result;
  }

  private boolean IsCorrectChoice(int Idx) {
    boolean b = false;
    /* if(Idx >=1 && Idx <= 9){
      System.out.println("Wrong Position Entered, Choose correct position.");
    } */
    for (int i = 0; i < Num.length; i++) {
      for (int j = 0; j < 3; j++) {
        if (GetChar(Idx) == 'X' || GetChar(Idx) == 'Y') {
          System.out.println("Wrong Position Entered,Choose left position.");
          b = false;
          break;
        } else {
          b = true;
        }
      }
      if (b == false) {
        break;
      }
    }
    return b;
  }

  private char GetChar(int Idx) {
    char c = 'N';
    switch (Idx) {
      case 0:
        c = this.Num[0][0];
        break;
      case 1:
        c = this.Num[0][1];
        break;
      case 2:
        c = this.Num[0][2];
        break;
      case 3:
        c = this.Num[1][0];
        break;
      case 4:
        c = this.Num[1][1];
        break;
      case 5:
        c = this.Num[1][2];
        break;
      case 6:
        c = this.Num[2][0];
        break;
      case 7:
        c = this.Num[2][1];
        break;
      case 8:
        c = this.Num[2][2];
        break;
    }
    return c;
  }

  private void SetChar(int Idx, char ch) {
    switch (Idx) {
      case 0:
        this.Num[0][0] = ch;
        break;
      case 1:
        this.Num[0][1] = ch;
        break;
      case 2:
        this.Num[0][2] = ch;
        break;
      case 3:
        this.Num[1][0] = ch;
        break;
      case 4:
        this.Num[1][1] = ch;
        break;
      case 5:
        this.Num[1][2] = ch;
        break;
      case 6:
        this.Num[2][0] = ch;
        break;
      case 7:
        this.Num[2][1] = ch;
        break;
      case 8:
        this.Num[2][2] = ch;
        break;
    }
  }

  private void Award(String WinnerName) {
  
    System.out.println(WinnerName + " won the game.");
    System.out.println("Thanks players, To play this game.");
    System.out.print("Do you want to play this game again[Y\\N]:");
    Scanner in = new Scanner(System.in);
    char c = in.next().charAt(0);
    in.close();
    if(c == 'y' || c == 'Y') {
       PlayGame();
    }
    else{
      System.out.println("Ok, No problem.");
    }
  }

  private void SetName() {
    System.out.print("\nDo you want to set your Name[Y\\N]:");
    Scanner input = new Scanner(System.in);
    char c = input.next().charAt(0);
    input.close();
    if (c == 'y' || c == 'Y') {
      System.out.print("Enter the First player name: ");
      Scanner in = new Scanner(System.in);
      PlayerName[0] = in.nextLine();
      System.out.print("Enter the Second player name: ");
      PlayerName[1] = in.nextLine();
      in.close();
    }
  }

  public static void main(String[] args) {
    TicTacTeo T = new TicTacTeo();
    T.PlayGame();
  }
}
