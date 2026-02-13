public class ElectricCar extends Vehicle{
  static int count;
  static ElectricCar ev[] = new ElectricCar[3];
  int batCap;
  
  public ElectricCar(String model, int price, int batCap){
    super(model, price);
    vehicleId = "EV000";
    this.batCap = batCap;
    ev[count] = this;
    count++;
    System.out.println("Vehicle ID: " + vehicleId + " created");
  }
  
  public void vehicleDetail(){
    super.vehicleDetail();
    System.out.println("Type: Electric Vehicle");
    System.out.println("Battery Capacity: " + batCap + " kWh");
  }
  
  public static void markAsSoldEV(ElectricCar car){
    for(int i=0; i<count; i++){
      if(car==ev[i]){
        ev[i].sold = true;
      }
    }
  }
}
