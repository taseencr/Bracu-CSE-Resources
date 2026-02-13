public class Student{
  String name;
  int id;
  double cg;
  
  public Student(String name, int id, double cg){
    this.name = name;
    this.id = id;
    this.cg = cg;
  }
  
  public void updateId(int id){
    this.id = id;
  }
}
