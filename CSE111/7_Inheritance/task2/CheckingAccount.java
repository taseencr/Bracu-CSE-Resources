public class CheckingAccount extends Account{
  static int count;
  
  public CheckingAccount(double balance){
    super(balance);
    count++;
  }
  public CheckingAccount(){
    super(0);
    count++;
  }
  
  public double showBalance(){
    return balance;
  }
}
