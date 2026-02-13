import java.util.Arrays;

public class DroneController{
  static Drone[] drones = new Drone[5];
  static int count;
  boolean isCont;
  
  public DroneController(){
    
  }
  
  public void activateDrone(Drone drone){
    if(drone.getBat()>=10){
      drone.isActive = true;
      drones[count] = drone;
      count++;
      System.out.println(drone.getDroneID() + " activated by the controller.");
    }
    else System.out.println("Not enough battery power to activate the drone.");
  }
  
  public void flyDrone(Drone drone){
    if(isCont) System.out.println("A drone controller can fly one drone at a time.");
    else{
      if(drone.isActive){
        drone.isFlying = true;
        isCont = true;
        System.out.println(drone.getDroneID() + " in flight.");
      }
      else System.out.println("Cannot fly unless activated.");
    }
  }
  
  public void landDrone(Drone drone){
    drone.isFlying = false;
    isCont = false;
  }
  
  public void systemShutDown(){
    isCont = false;
    for(int i=0; i<count; i++){
      drones[i].isActive = false;
      drones[i].isFlying = false;
      drones[i] = null;
    }
  }
  
  public static String getActiveDrones(){
    return Arrays.toString(drones);
  }
}
