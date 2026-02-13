public class MoneyTracker{
  String name;
  double balance;
  double lastInc;
  double lastExp;
  
  public MoneyTracker(){
    System.out.println("A new money tracker has been launched.");
  }
  
  public String info(){
    return "Name: " + name + "\nCurrent Balance: " + balance;
  }
  
  public void createTracker(String name){
    this.name = name;
    balance = 1;
  }
  
  public void income(int income){
    lastInc = income;
    balance += income;
    System.out.println("Balance Updated!");
  }
  
  public void expense(int expense){
    if(expense==balance){
      lastExp = expense;
      balance -= expense;
      System.out.println("You're broke!");
    }
    else if(expense>balance){
      System.out.println("Not enough balance.");
    }
    else{
      lastExp = expense;
      balance -= expense;
      System.out.println("Balance Updated.");
    }
  }
  
  public void showHistory(){
    System.out.println("Last added: " + lastInc);
    System.out.println("Last spent: " + lastExp);
  }
}
