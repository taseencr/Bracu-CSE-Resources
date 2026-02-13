public class UberEatsUser{
  String name;
  String location;
  
  public UberEatsUser(String name){
    this.name = name;
  }
  public UberEatsUser(String name, String location){
    this.name = name;
    this.location = location;
  }
  
  public void updateLocation(String location){
    if(this.location==null){
      this.location = location;
      System.out.println("Update Successful!");
    }
    else System.out.println("We already have your location. Please place an order!");
  }
}
