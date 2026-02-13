import java.util.Arrays;
public class DroneController{
  public static Drone activeDrones[] = new Drone[5];
  int dCount;
  Drone curDrone;
  boolean alreadyFlying;
  
  public void activeDrone(Drone drone){
    curDrone = drone;
    if(drone.getBP()<10) System.out.println("Not enough batter power to activate the drone.");
    else{
      drone.isActive = true;
      activeDrones[dCount] = curDrone;
      dCount++;
      System.out.println(curDrone.getDroneID() + " activated by the controller.");
    }
  }
  
  public static String getActiveDrones(){
    return Arrays.toString(activeDrones);
  }
  
  public void flyDrone(Drone drone){
    if(!alreadyFlying){
      if(drone.isActive){
        drone.isFlying = true;
        alreadyFlying = true;
        System.out.println(drone.getDroneID() + " in flight.");
      }
      else System.out.println("Cannot fly unless activated.");
    }
    else System.out.println("A drone controller can fly one drone at a time.");
  }

  public void landDrone(Drone drone){
    drone.isFlying = false;
    alreadyFlying = false;
  }
  
  public void systemShutDown(){
    for(int i=0; i<dCount; i++){
      activeDrones[i].isActive = false;
      activeDrones[i] = null;
    }
  }
}
