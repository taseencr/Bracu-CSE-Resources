public class Cargo{
  static double capacity = 10;
  static Cargo cargo[] = new Cargo[4];
  static int count;
  static double tweight;
  static int idH = 1;
  int id;
  String contents;
  double weight;
  boolean isLoaded;
  
  public Cargo(String contents, double weight){
    this.contents = contents;
    this.weight = weight;
    id = idH;
    idH++;
  }
  
  public void details(){
    System.out.println("Cargo ID: " + id + ", Contents: " + contents + ",");
    System.out.println("Weight " + weight + ", Loaded: " + isLoaded);
  }
  
  public void load(){
    if(tweight+weight<=capacity){
      cargo[count] = this;
      count++;
      tweight += weight;
      System.out.println("Cargo " + id + " loaded for transport.");
    }
    else System.out.println("Cannot load cargo, exceeds weight capacity.");
  }
  public void unload(){
    int idx = -1;
    for(int i=0; i<count; i++){
      if(this==cargo[i]) idx = i;
    }
    for(int i=idx; i<count-1; i++){
      cargo[i] = cargo[i+1];
    }
    cargo[count] = null;
    count--;
    tweight -= weight;
    System.out.println("Cargo " + id + " unloaded.");
  }
  
  public static double capacity(){
    return capacity-tweight;
  }
}
