public class Character{
  static int count;
  static Character chars[] = new Character[4];
  int id;
  String name;
  String group;
  int health;
  
  public Character(String name, String group, int health){
    if(count<4){
      this.id = count+1;
      this.name = name;
      this.group = group;
      this.health = health;
      chars[count] = this;
      count++;
    }
  }
  public Character(String name, int health){
    this(name, "Teen", health);
  }
  
  public static void printStats(){
    int kids = 0, teens = 0, adults = 0, totalhp = 0, scharidx = 0, scharhp = 0;
    for(int i=0; i<count; i++){
      if(chars[i].group.equals("Kid")) kids++;
      else if(chars[i].group.equals("Teen")) teens++;
      else if(chars[i].group.equals("Adult")) adults++;
      if(scharhp<chars[i].health){
        scharidx = i;
        scharhp = chars[i].health;
      }
      totalhp += chars[i].health;
    }
    double avghp = 0;
    if(count>0) avghp = totalhp/count;
    
    System.out.println("Total Characters: " + count);
    System.out.println("Kids: " + kids);
    System.out.println("Teens: " + teens);
    System.out.println("Adults: " + adults);
    System.out.println("Average Health: " + avghp);
    if(count==0) System.out.println("Strongest Character: None");
    else System.out.println("Strongest Character: " + chars[scharidx].name + " (Health "+ chars[scharidx].health + ")");
  }
  
  public void printDetails(){
    System.out.println("ID: " + id + ", Name: " + name);
    System.out.println("Group: " + group);
    System.out.println("Health: " + health);
  }
}
