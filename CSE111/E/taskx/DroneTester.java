public class DroneTester {
  public static void main(String[] args) {
    
    Drone drone1 = new Drone("DRN001", 9);
    Drone drone2 = new Drone("DRN002", 85);
    
    System.out.println("1================");
    DroneController dc1 = new DroneController();
    
    System.out.println("2================");
    dc1.activateDrone(drone1);
    
    System.out.println("3================");
    drone1.chargeDrone(50);
    
    System.out.println("4================");
    dc1.activateDrone(drone1);
    
    System.out.println("5================");
    System.out.println("Active drones: " + DroneController.getActiveDrones());
    drone1.displayStatus();
    
    System.out.println("6================");
    dc1.flyDrone(drone1);

    System.out.println("7================");
    drone1.displayStatus();
    
    System.out.println("8================");
    dc1.flyDrone(drone2);
    
    System.out.println("9================");
    dc1.landDrone(drone1);
    drone1.displayStatus();
    
    System.out.println("10================");
    dc1.flyDrone(drone2);
    dc1.activateDrone(drone2);
    dc1.flyDrone(drone2);
    
    System.out.println("11================");
    System.out.println("Active drones: " + DroneController.getActiveDrones());
    
    dc1.systemShutDown();
    System.out.println("Active drones after shutdown: " + DroneController.getActiveDrones());
  }
}
