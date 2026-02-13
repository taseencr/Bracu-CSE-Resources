public class Bike extends Vehicle{
  String model;
  boolean hasSideCar;
  
  public Bike(String brand, String model, int year, int wheels, boolean hasSideCar){
    super(brand, year);
    setWheels(wheels);
    this.model = model;
    this.hasSideCar = hasSideCar;
  }
  
  public void doAWheelie(){
    if(hasSideCar) System.out.println("Wheelie Failed. " + getBrand() + ":" + model + " has SideCar");
    else System.out.println(getBrand() + ":" + model + " is doing Wheelie!!");
  }
  
  public String toString(){
    String s = "Bike " + super.toString();
    s += ", Model: " + model + ", SideCar: " + hasSideCar;
    return s;
  }
}
