public class Student{
  int id;
  double cg;
  String course[] = new String[4];
  int count;
  
  public Student(int id){
    this.id = id;
    System.out.println("A student with ID " + id + " has been created.");
  }
  public Student(int id, double cg){
    this.id = id;
    this.cg = cg;
    System.out.println("A student with ID " + id + " and cgpa " + cg + " has been created.");
  }
  
  public void addCourse(String course){
    if(cg==0){
      System.out.println("Failed to add " + course);
      System.out.println("Set CG first");
    }
    else if(cg<3){
      if(count<3){
        this.course[count] = course;
        count++;
      }
      else{
        System.out.println("Failed to add " + course);
        System.out.println("CG is low. Can't add more than 3 courses.");
      }
    }
    else if(count<4){
      this.course[count] = course;
      count++;
    }
    else{
      System.out.println("Failed to add " + course);
      System.out.println("Maximum 4 courses allowed.");
    }
  }
  public void addCourse(String course[]){
    for(int i=0; i<course.length; i++){
      addCourse(course[i]);
    }
  }
  
  public void storeCG(double cg){
    this.cg = cg;
  }
  public void storeID(int id){
    this.id = id;
  }
  public void removeAllCourse(){
    count=0;
  }
  
  public void showAdvisee(){
    System.out.println("Student ID: " + id + ", CGPA: " + cg);
    if(count==0) System.out.println("No courses added.");
    else{
      System.out.println("Added courses are: ");
      for(int i=0; i<count; i++){
        System.out.print(course[i] + " ");
      }
      System.out.println();
    }
  }
}
