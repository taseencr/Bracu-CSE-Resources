public class Caterpillar_Tester {
  public static void main(String[] args) {
    Caterpillar c = new Caterpillar("Leaf", 5);
    c.showDetails();
    System.out.println("--------------1-------------");
    c.eat();
    c.eat(3);
    c.showDetails();
    System.out.println("--------------2-------------");
    Butterfly b = new Butterfly("Flower", 2);
    Moth m = new Moth("Cotton", 4);    
    System.out.println("--------------3-------------");
    b.transform();
    m.transform();
    System.out.println("--------------4-------------");
    b.eat(2);        
    m.eat(5);        
    System.out.println("--------------5-------------");
    b.showDetails(); 
    m.showDetails();    
  }
}
