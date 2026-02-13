public class Player{
  String name;
  int hp;
  String villain[] = new String[5];
  int count;
  
  public Player(String name, int hp){
    this.name = name;
    this.hp = hp;
    System.out.println(name + " joined the game");
    System.out.println("HP: " + hp);
  }
  public Player(String name){
    this(name, 100);
  }
  
  public void viewInfo(){
    System.out.println("Player Name: " + name);
    System.out.println("Current HP: " + hp);
    if(count>0){
      System.out.println("Defeated: ");
      for(int i=0; i<count; i++){
        System.out.print(villain[i] + ", ");
      }
      System.out.println();
    }
  }
  
  public void defeatVillain(String vil, int vhp){
    if(vhp>hp) System.out.println("failed to defeat " + vil);
    else{
      hp += vhp;
      villain[count] = vil;
      count++;
      System.out.println("defeated " + vil);
    }
  }
  public void defeatVillain(int x, String vil, int vhp){
    x = x-'0';
    hp *= x;
    System.out.println("HP with " + x + "x boost: " + hp);
    defeatVillain(vil, vhp);
  }
  public void defeatVillain(Player vil){
    defeatVillain(vil.name, vil.hp);
  }
}
