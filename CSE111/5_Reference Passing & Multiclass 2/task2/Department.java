public class Department{
  String dept;
  Student std[] = new Student[5];
  int count;
  
  public Department(String dept){
    this.dept = dept;
  }
  
  public void findStudent(int id){
    int idx = -1;
    for(int i=0; i<count; i++){
      if(std[i].id==id){
        idx = i;
        System.out.println("Student info: ");
        System.out.println("Student Name: " + std[i].name);
        System.out.println("ID: " + std[i].id);
        System.out.println("CGPA: " + std[i].cg);
      }
    }
    if(idx==-1) System.out.println("Student with this ID doesn't exist, Please give a valid ID");
  }
  
  public void addStudent(Student student){
    if(count<5){
      boolean isFound = false;
      for(int i=0; i<count; i++){
        if(std[i].id==student.id){
          System.out.println("Student with the same ID already exists, Please try with another ID");
          isFound = true;
        }
      }
      if(!isFound){
        std[count] = student;
        count++;
        System.out.println("Welcome to " + dept + " department, " + student.name);
      }
    }
  }
  public void addStudent(Student s1, Student s2, Student s3){
    addStudent(s1);
    addStudent(s2);
    addStudent(s3);
  }
  
  public void details(){
    System.out.println("Department Name: " + dept);
    System.out.println("Number of student: " + count);
    System.out.println("Details of the students: ");
    for(int i=0; i<count; i++){
      System.out.println("Student name: " + std[i].name + ", ID: " + std[i].id + ", cgpa: " + std[i].cg);
    }
  }
}
