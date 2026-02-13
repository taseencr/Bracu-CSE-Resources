public class Cow extends Animal{
  String name;
  
  public Cow(){
    System.out.println("The cow says hello!");
  }
  
  public String getName(){
    return name;
  }
  
  public void updateSound(String sound){
    this.sound = sound;
  }
}
