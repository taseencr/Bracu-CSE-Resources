public class Bike extends Vehicle{
  String model;
  boolean sideCar;
  
  public Bike(String brand, String model, int year, int wheels, boolean sideCar){
    super(brand, year);
    super.setWheels(wheels);
    this.model = model;
    this.sideCar = sideCar;
  }
  
  public void doAWheelie(){
    if(sideCar) System.out.println("Wheelie Failed. " + getBrand() + ":" + model + " has SideCar");
    else System.out.println(getBrand() + ":" + model + " is doing Wheelie!!");
  }
  
  public String toString(){
    String s = "Bike " + super.toString();
    s += ", Model: " + model + ", SideCar: " + sideCar;
    return s;
  }
}
