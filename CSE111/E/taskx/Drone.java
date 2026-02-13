public class Drone{
  private String droneID;
  private int battery;
  boolean isActive;
  boolean isFlying;
  
  public String getDroneID(){
    return droneID;
  }
  public int getBat(){
    return battery;
  }
  
  public Drone(String id, int bat){
    droneID = id;
    battery = bat;
  }
  
  public void chargeDrone(int charge){
    battery += charge;
    System.out.println("Charged to " + battery + " %.");
  }
  
  public void displayStatus(){
    System.out.println("Drone ID: " + droneID);
    System.out.println("Battery %: " + battery);
    System.out.println("Active status: " + isActive);
    System.out.println("Flying status: " + isFlying);
  }
  
  public String toString(){
    return droneID;
  }
}
