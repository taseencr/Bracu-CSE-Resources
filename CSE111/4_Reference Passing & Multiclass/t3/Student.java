public class Student{
  String name;
  int id;
  String dept;
  String email;
  String password;
  boolean status;
  String courses[] = new String[3];
  int count;
  
  public Student(String name,  int id, String dept){
    this.name = name;
    this.id = id;
    this.dept = dept;
    System.out.println("Student object is created");
  }
}
