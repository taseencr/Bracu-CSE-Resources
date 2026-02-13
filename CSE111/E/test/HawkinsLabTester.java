public class HawkinsLabTester {
  public static void main(String[] args) {
    Hawkins place1 = new Hawkins("Hawkins Lab");
    Hawkins place2 = new Hawkins("Palace Arcade");
    UpsideDown gate1 = new UpsideDown("The Nina Project");
    UpsideDown gate2 = new UpsideDown("Brimborn Steel Works");
    DarkDimension world = new DarkDimension("The Dark World");
    gate1.open();
    System.out.println("Total bridges: " + UpsideDown.totalBridges);
    System.out.println("======== [1] ========");
    gate1.connect(place1);
    gate1.connect(place2); 
    Hawkins place3 = new Hawkins("Starcourt Mall");
    gate2.connect(place3);  
    gate1.details();
    gate2.details(); 
    System.out.println("======== [2] ========");
    world.runExperiment(gate1);
    world.runExperiment(gate2); 
    System.out.println("======== [3] ========");
    System.out.println("Total bridges: " + UpsideDown.totalBridges); 
    System.out.println("======== [4] ========");
    Hawkins place4 = new Hawkins("Byers new house");
    gate1.connect(place4);
    gate1.disconnect(2);
    gate2.disconnect(3); 
    System.out.println("======== [5] ========");
    gate1.details();
  }
}
