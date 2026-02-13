public class CSEStudent extends Student{
  static int count;
  static String courses[] = {"CSE110", "CSE111", "CSE220", "CSE221"};
  
  public CSEStudent(String n, int i){
    super(n, i);
    count++;
  }
  
  public static void details(){
    System.out.println("Total CSE Students: " + count);
    System.out.println("Available Lab Based Courses: ");
    for(int i=0; i<courses.length; i++){
      System.out.print(courses[i] + " ");
    }
    System.out.println();
  }
  
  public void addLabBasedCourse(String course){
    int temp = -1;
    for(int i=0; i<courses.length; i++){
      if(courses[i].equals(course)) temp = i;
    }
    if(temp==-1) System.out.println("It is not a lab based course!");
    else{
      super.courses += courses[temp] + " ";
    }
  }
}
