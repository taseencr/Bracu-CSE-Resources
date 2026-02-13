public class BikeDriver extends GenericDriver{
  String profile;
  static String restrictedAreas[] = new String[3];
  static int count;
  
  public BikeDriver(String name, String profile){
    super(name);
    this.profile = profile;
  }
  
  public String toString(){
    return getName() + "'s driver profile is " + profile;
  }
  
  public String acceptRide(boolean hasVehicle){
    return super.acceptRide(hasVehicle) + "\n" + this;
  }
  
  public static void restrictedAreas(String res){
    restrictedAreas[count] = res;
    count++;
  }
  
  public void fightRestriction(String res[]){
    for(int i=0; i<res.length; i++){
      boolean cantEnter = false;
      for(int j=0; j<restrictedAreas.length; j++){
        if(res[i].equals(restrictedAreas[j])){
          cantEnter = true;
          break;
        }
      }
      if(cantEnter) System.out.println(getName() + " cannot enter " + res[i]);
      else System.out.println(getName() + " can enter " + res[i]);
    }
  }
}
