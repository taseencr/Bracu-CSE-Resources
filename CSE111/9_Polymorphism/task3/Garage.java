public class Garage{
  Car cars[];
  Bike bikes[];
  int bcount, bmax;
  int ccount, cmax;
  
  public Garage(int ccap, int bcap){
    this.cars = new Car[ccap];
    this.bikes = new Bike[bcap];
    cmax = ccap;
    bmax = bcap;
    System.out.println("Welcome to the Garage!");
    System.out.println("Car Capacity: " + ccap);
    System.out.println("Bike Capacity: " + bcap);
  }
  
  public void addVehicle(Vehicle obj){
    if(obj instanceof Car){
      if(ccount<cmax){
        cars[ccount] = (Car)obj;
        ccount++;
        System.out.println("A " + obj.getBrand() + " CAR has been added to the Garage");
      }
      else System.out.println("Can't add more Cars! Capacity: " + cmax);
    }
    else if(obj instanceof Bike){
      if(bcount<bmax){
        bikes[bcount] = (Bike)obj;
        bcount++;
        System.out.println("A " + obj.getBrand() + " BIKE has been added to the Garage");
      }
      else System.out.println("Can't add more bikes! Capacity: " + bmax);
    }
  }
}
