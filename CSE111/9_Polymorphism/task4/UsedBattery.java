public class UsedBattery extends Waste{
  boolean isLeaking;
  
  public UsedBattery(String id, boolean isL){
    super(id);
    isLeaking = isL;
  }
}
