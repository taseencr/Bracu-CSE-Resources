class GameCharacter {
  public static String [] allCharacters= new String [5];
  public static int characterCount=0;  
  private String characterName;
  private int level;
  public String weaponType;
  public double totalDamage;
  public GameCharacter(String name, int level, String weapon) {
    this.characterName = name;
    this.level = level;
    this.weaponType= weapon;
  }
  public String getCharacterInfo() {
    return "Name: " + characterName + ", Level: " + level;
  }
  public int getLevel(){
    return level;
  }
  public static void printAllCharacters(){ 
    if (characterCount>0){
      System.out.println("Available Characters:");
      for(int i=0;i<characterCount;i++){
        System.out.println(allCharacters[i]);     
      }
    }
    else{
      System.out.println("No available character");
    }
  }
}
