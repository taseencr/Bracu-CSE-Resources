public class Nokia extends Mobile{
  double balance;
  
  public Nokia(String model, boolean simStatus, String imei, double balance){
    super(model, imei, simStatus);
    this.balance = balance;
    System.out.println("Model " + model + " is manufactured.");
  }
  
  public String toString(){
    String s = super.toString();
    s += "\nBalance: " + balance + " TK";
    return s;
  }
  
  public String dialCall(String num){
    String result;
    if(simCardStatus){
      if(balance>0){
        String temp = "";
        for(int i=0; i<3; i++){
          char ch = num.charAt(i);
          temp += ch;
        }
        String region = super.getCountryName(temp);
        if(region!=null) result = "Dialing the number " + num + " to " + region + " region.";
        else result = "Dialing is not allowed in this region.";
      }
      else result = "Insufficient balance! Please recharge.";
    }
    else result = "No SIM card available! Please check the SIM card connectivity.";
    return result;
  }
  
  public void rechargeSIMCard(double rec){
    balance += rec;
    System.out.println("Recharge successful! Current balance " + balance + " TK.");
  }
}
