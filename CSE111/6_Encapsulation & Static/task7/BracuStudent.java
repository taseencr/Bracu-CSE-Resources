public class BracuStudent{
  String name;
  boolean hasPass;
  private String location;
  
  public String getLoc(){
    return location;
  }
  
  public BracuStudent(String name, String location){
    this.name = name;
    this.location = location;
  }
  
  public void collectPass(){
    hasPass = true;
  }
  
  public void setLocation(String location){
    this.location = location;
  }
  
  public void showDetails(){
    System.out.println("Student Name: " + name);
    System.out.println("Lives in " + location);
    System.out.println("Have Bus pass: " + hasPass);
  }
}
