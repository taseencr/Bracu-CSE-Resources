public class Moth extends Caterpillar{
  public Moth(String food, int age){
    super(food, age);
  }
  
  public void transform(){
    System.out.println("Caterpillar transforms into Moth");
  }
  
  public void eat(int amount){
    energy += (amount*2.5)-2.5;
    System.out.println("Moth lost energy due to nocturnal activity");
  }
  
  public void showDetails(){
    System.out.println("Food: " + food);
    System.out.println("Age: " + age);
    System.out.println("Energy: " + energy + " joules");
  }
}
