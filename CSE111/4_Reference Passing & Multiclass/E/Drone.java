public class Drone{
  private String droneID;
  private int batPer;
  public boolean isActive;
  public boolean isFlying;
  
  public Drone(String droneID, int batPer){
    this.droneID = droneID;
    this.batPer = batPer;
  }
  
  public String getDroneID(){
    return droneID;
  }
  public int getBP(){
    return batPer;
  }
  public void setBP(int charge){
    batPer = charge;
  }
  
  public void displayStatus(){
    System.out.println("Drone ID: " + droneID);
    System.out.println("Battery %: " + batPer);
    System.out.println("Active status: " + isActive);
    System.out.println("Flying status: " + isFlying);
  }
  
  public void chargeDrone(int charge){
    batPer += charge;
    System.out.println("Charged to " + batPer + " %");
  }
  
  public String toString(){
    return droneID;
  }
}
