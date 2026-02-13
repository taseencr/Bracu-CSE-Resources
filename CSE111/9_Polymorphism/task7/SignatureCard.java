public class SignatureCard extends CreditCard{
  public SignatureCard(String name, String ac){
    super(name, ac, 200);
  }
  
  public void spendCash(int spend){
    System.out.println("Previous Reward Points: " + rewardPoints);
    rewardPoints += (spend*1.0/100)*4;
    System.out.println("Reward points after spending " + spend + " taka: " + rewardPoints);
  }
  
  public void cardDetails(){
    super.cardDetails();
    System.out.println("Possible Number of Companions for Lounge: 5");
  }
}
