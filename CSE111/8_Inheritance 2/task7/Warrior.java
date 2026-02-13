public class Warrior extends GameCharacter{
  int strength;
  int armor;
  
  public Warrior(String name, int lvl, int strength, int armor, String weapon){
    super(name, lvl, weapon);
    this.strength = strength;
    this.armor = armor;
    allCharacters[characterCount] = name;
    characterCount++;
    System.out.println("A new warrior has arrived");
  }
  
  public void calculateDamage(){
    totalDamage = (getLevel()*strength)+(armor*50);
  }
  
  public String toString(){
    String res = getCharacterInfo();
    res += "\nCharacter Type: Warrior \nWeapon: " + weaponType + "\nStrength: " + strength + ", Armor: " + armor + "\nTotal Damage: " + totalDamage;
    return res;
  }
}
