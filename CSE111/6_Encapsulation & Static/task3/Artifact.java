public class Artifact{
  private String artc;
  private String cname;
  private int power;
  private static Artifact Vault[] = new Artifact[4];
  private static int count;
  
  public Artifact(String artc, String cname){
    this.artc = artc;
    this.cname = cname;
    CalcPower();
  }
  public Artifact(String artc){
    this(artc, "Okabe");
  }
  
  public String GetName(){
    return artc;
  }
  public int CalcPower(){
    power = 0;
    if(artc.length()%2==0){
      for(int i=0; i<artc.length(); i+=2){
        char ch = artc.charAt(i);
        power += ch;
      }
    }
    else{
      for(int i=1; i<artc.length(); i+=2){
        char ch = artc.charAt(i);
        power += ch;
      }
    }
    return power;
  }
  public void revealArtifact(){
    System.out.println(artc + " added by " + cname + " has power of " + power + ".");
  }
  
  public void changeName(String artc){
    this.artc = artc;
    CalcPower();
    System.out.println("Name changed and power recalculated.");
  }
  
  public static void AddtoVault(Artifact obj){
    if(count<4){
      Vault[count] = obj;
      count++;
      System.out.println(obj.cname + " added " + obj.artc + " successfully to the vault.");
    }
    else System.out.println("!!" + obj.cname + " unsuccessful in adding artifact to the vault!!");
  }
  
  public static void labReport(){
    System.out.println("=== Future Gadget Lab ===");
    for(int i=0; i<count; i++){
      Vault[i].revealArtifact();
    }
  }
  
  public static String strongest(){
    int idx = -1;
    int max = 0;
    for(int i=0; i<count; i++){
      if(Vault[i].power>max){
        idx = i;
        max = Vault[i].power;
      }
    }
    return Vault[idx].artc;
  }
}
