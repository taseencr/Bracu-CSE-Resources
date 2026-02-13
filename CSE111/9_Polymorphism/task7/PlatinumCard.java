public class PlatinumCard extends CreditCard{
  public PlatinumCard(String name, String ac){
    super(name, ac, 100);
  }
  
  public void spendCash(int spend){
    System.out.println("Previous Reward Points: " + rewardPoints);
    rewardPoints += (spend*1.0/100)*2;
    System.out.println("Reward points after spending " + spend + " taka: " + rewardPoints);
  }
}
