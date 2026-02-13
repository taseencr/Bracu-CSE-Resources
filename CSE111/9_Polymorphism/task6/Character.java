public class Character {
  public String name;
  public int level;
  
  public Character(String name, int level) {
    this.name = name;
    this.level = level;
  }
  
  public void specialMove() {
    System.out.println("Character uses a generic move.");
  }
  
  public boolean equals(Character obj){
    return this.name.equals(obj.name) && this.level == obj.level;
  }
}
