public class Connect{
  int totalAdvisee;
  Student advisee[] = new Student[5];
  
  public Connect(){
    System.out.println("Connect is ready to use!");
  }
  
  public void login(Student std){
    if(std.email==null || std.password==null) System.out.println("Email and password need to be set.");
    else{
      std.status = true;
      System.out.println("Login successful");
    }
  }
  
  public void advising(Student std){
    if(!std.status) System.out.println("Please login to advise courses!");
    else{
      System.out.println("You haven't selected any courses.");
    }
  }
  public void advising(Student std, String c1, String c2, String c3, String c4){
    System.out.println("You need special approval to take more than 3 courses.");
  }
  public void advising(Student std, String c1, String c2, String c3){
    if(!std.status) System.out.println("Please login to advise courses!");
    else{
      std.courses[0] = c1;
      std.courses[1] = c2;
      std.courses[2] = c3;
      advisee[totalAdvisee] = std;
      totalAdvisee++;
      System.out.println("Advising successful!");
    }
  }
  
  public void allAdviseeInfo(){
    System.out.println("Total Advisee: " + totalAdvisee);
    for(int i=0; i<totalAdvisee; i++){
      System.out.println("Name: " + advisee[i].name + " ID: " + advisee[i].id);
      System.out.println("Department: " + advisee[i].dept);
      System.out.println("Advised Courses: ");
      for(int j=0; j<3; j++){
        System.out.print(advisee[i].courses[j] + " ");
      }
      System.out.println();
      System.out.println("==============");
    }
  }
}
