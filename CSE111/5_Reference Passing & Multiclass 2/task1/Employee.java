public class Employee{
  String name;
  int id;
  String type;
  
  public Employee(){
    System.out.println("A default employee has been created");
  }
  public Employee(String name, int id, String type){
    this.name = name;
    this.id = id;
    this.type = type;
  }
}
