package MyPractice;

abstract class Functions{
  abstract void Withdraw();
  abstract void Deposite();
}
public class Account extends Functions{
  void Withdraw(){
    System.out.println("Withdraw the cash.");
  }
  void Deposite(){
    System.out.println("Deposite");
  }
  
  public static void main(String[] args) {
	Account A = new Account();
	A.Withdraw();
	A.Deposite();
  }

}