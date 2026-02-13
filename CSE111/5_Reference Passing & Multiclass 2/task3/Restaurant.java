public class Restaurant{
  String name;
  String location;
  UberEatsUser orders[] = new UberEatsUser[3];
  int count;
  
  public Restaurant(String name, String location){
    this.name = name;
    this.location = location;
  }
  
  public void takeOrder(UberEatsUser usr){
    if(usr.location==null) System.out.println("Location : Unknown. Please update your location information!");
    else{
      if(count<3){
        boolean isFound = false;
        for(int i=0; i<count; i++){
          if(orders[i]==usr){
            isFound = true;
            System.out.println("You already have a pending order!");
          }
        }
        if(!isFound){
          orders[count] = usr;
          count++;
          System.out.println("Your order has been added!");
        }
      }
      else System.out.println("We are really busy right now. Please order after some time. Thank you!");
    }
  }
  
  public void completeOrders(){
    if(count==0) System.out.println("No pending orders at the moment.");
      System.out.println("Showing " + name + "'s orders: ");
      for(int i=0; i<count; i++){
        System.out.println("Order by " + orders[i].name + " at " + orders[i].location + " completed");
        orders[i] = null;
      }
      count = 0;
  }
}
