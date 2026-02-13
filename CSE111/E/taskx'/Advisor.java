public class Advisor {
  public String name;
  public String type;
  public static int count;
  
  public Advisor(String name, String type) {
    this.name = name;
    this.type = type;
  }
  
  public void advising() {
    System.out.println("Advising will start soon!");
  }
  
  public String toString() {
    return "Advisor Name: " + name +
      "\nAdvisor Type: " + type;
  }
}
