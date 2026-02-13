public class Desktop{
  static int pccount;
  String name;
  String[] specs = new String[10];
  String[] features = new String[10];
  int count;
  
  public static String details(){
    return "Number of Desktops: " + pccount;
  }
  
  public Desktop(){
    pccount++;
  }
  public Desktop(String name){
    this.name = name;
    pccount++;
  }
  
  public void updateName(String name){
    this.name = name;
  }
  
  public void addFeature(String spec, String feature){
    if(name==null) System.out.println("Feature cannot be added without desktop name");
    else{
      int idx = -1;
      for(int i=0; i<count; i++){
        if(specs[i]==spec) idx = i;
      }
      if(idx>-1){
        features[idx] += ", " + feature;
      }
      else{
        specs[count] = spec;
        features[count] = feature;
        count++;
      }
    }
  }
  
  public void printDetail(){
    System.out.println("Name: " + name);
    for(int i=0; i<count; i++){
      System.out.println(specs[i] + ": " + features[i]);
    }
  }
}
