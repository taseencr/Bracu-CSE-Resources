public class Car extends Vehicle{
  String model;
  int doors;
  boolean isAI;
  
  public Car(String brand, String model, int year, int doors, int wheels, boolean isAI){
    super(brand, year);
    super.setWheels(wheels);
    this.model = model;
    this.doors = doors;
    this.isAI = isAI;
  }
  
  public void startAutoPilot(){
    if(isAI) System.out.println(getBrand() + ":" + model + " AutoPilot Started");
    else System.out.println(getBrand() + ":" + model + " has NO AutoPilot");
  }
  
  public String toString(){
    String s = "Car " + super.toString();
    s += ", Model: " + model + ", Doors: " + doors + ", AI: " + isAI;
    return s;
  }
}
