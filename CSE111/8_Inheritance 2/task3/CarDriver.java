public class CarDriver extends GenericDriver{
  static String restrictedAreas[] = new String[2];
  static int count;
  
  public CarDriver(String name){
    super(name);
  }
  
  public String toString(){
    return getName() + "'s driver profile is a Premium";
  }
  
  public String acceptRide(boolean hasVehicle){
    return super.acceptRide(hasVehicle) + "\n" + getName() + "'s driver profile is Premium";
  }
  
  public void hasSafetyTraining(){
    super.hasSafetyTraining();
    System.out.println("Premium drivers receive extra safety briefings.");
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
