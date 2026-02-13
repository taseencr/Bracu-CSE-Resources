public class Mage extends GameCharacter{
  int intelligence;
  int mana;
  
  public Mage(String name, int lvl, int intelligence, int mana, String weapon){
    super(name, lvl, weapon);
    this.intelligence = intelligence;
    this.mana = mana;
    allCharacters[characterCount] = name;
    characterCount++;
    System.out.println("A new mage came to live");
  }
  
  public void calculateDamage(){
    totalDamage = (getLevel()*intelligence)+(mana*10);
  }
  
  public String toString(){
    String res = getCharacterInfo();
    res += "\nCharacter Type: Warrior \nWeapon: " + weaponType + "\nIntelligence: " + intelligence + ", Mana: " + mana + "\nTotal Damage: " + totalDamage;
    return res;
  }
}