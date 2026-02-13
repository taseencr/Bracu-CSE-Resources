public class UpsideDown extends Hawkins{
  Hawkins bridge1;
  Hawkins bridge2;
  static int totalBridges = 0;
  
  public UpsideDown(String name){
    super(name);
  }
  
  public Hawkins getBridge1(){
    return bridge1;
  }
  public Hawkins getBridge2(){
    return bridge2;
  }
  
  public void connect(Hawkins obj){
    if(bridge1==null){
      bridge1 = obj;
      totalBridges++;
    }
    else if(bridge2==null){
      bridge2 = obj;
      totalBridges++;
    }
    else System.out.println("No further bridges with " + name);
  }
  
  public void disconnect(int num){
    if(num==1){
      bridge1 = null;
      totalBridges--;
    }
    else if(num==2){
      bridge2 = null;
      totalBridges--;
    }
    else System.out.println("Invalid bridge number!");
  }
  
  public void details(){
    System.out.println(name + " Details: ");
    if(bridge1!=null){
      System.out.println("Bridge 1: " + bridge1.name);
      if(bridge2!=null){
        System.out.println("Bridge 2: " + bridge2.name);
      }
    }
  }
  
  public void activate(Hawkins obj){
    System.out.println("Activating the door of " + obj.name);
    obj.status = true;
  }
}
