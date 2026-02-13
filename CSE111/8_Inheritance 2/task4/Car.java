public class Car extends Vehicle{
  static Car cars[] = new Car[3];
  static int count;
  static int idH = 1;
  int seats;
  
  public Car(String model, int price, int seats){
    super(model, price);
    this.seats = seats;
    vehicleId = "CAR00" + idH;
    idH++;
    cars[count] = this;
    count++;
    System.out.println("Vehicle ID: " + vehicleId + " created");
  }
  
  public void vehicleDetail(){
    super.vehicleDetail();
    System.out.println("Type: Regular Car");
    System.out.println("Seats: " + seats);
  }
  
  public static void showAllAvailableCars(){
    System.out.println("Total Car: " + count);
    System.out.println("Available Cars: ");
    for(int i=0; i<count; i++){
      System.out.println(cars[i].vehicleId + " : " + cars[i].model);
    }
  }
  
  public static void markAsSold(Car car){
    for(int i=0; i<count; i++){
      if(car==cars[i]){
        cars[i].sold = true;
      }
    }
  }
  
  public static void showAllCars(){
    System.out.println("Total Car: " + count);
    for(int i=0; i<count; i++){
      String status = "";
      if(cars[i].sold) status = "sold";
      else status = "available";
      System.out.println(cars[i].vehicleId + " : " + cars[i].model + " - " + status);
    }
  }
}
