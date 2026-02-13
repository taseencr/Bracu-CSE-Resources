public class Paladin extends Warrior{
  public Paladin(String name, int level){
    super(name, level);
  }
  
  public void specialMove(){
    System.out.println(name + " unleashes a holy strike!");
  }
}
