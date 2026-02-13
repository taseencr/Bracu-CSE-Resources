public class CharacterTester {
  public static void main(String[] args) {
    Warrior warriorOne = new Warrior("Conan", 100, 150, 15, "Two-Handed Sword");
    System.out.println("--------1--------");
    warriorOne.calculateDamage();
    System.out.println(warriorOne);
    System.out.println("--------2--------");
    Mage mageOne = new Mage("Merlin", 80, 200, 18, "Arcane Staff");
    mageOne.calculateDamage();
    System.out.println(mageOne);
    System.out.println("--------3--------");
    GameCharacter.printAllCharacters();
  }
}
