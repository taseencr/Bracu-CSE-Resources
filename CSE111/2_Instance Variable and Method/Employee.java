public class Employee{
  String name;
  float salary = 30000;
  String desig = "junior";
  
  public void newEmployee(String name){
    this.name = name;
  }
  
  public void displayInfo(){
    System.out.println("Employee Name: " + name);
    System.out.println("Employee Salary: " + salary + " Tk");
    System.out.println("Employee Designation: " + desig);
  }
  
  public void calculateTax(){
    float tax;
    if(salary<=30000) System.out.println("No need to pay tax");
    else if(salary<=50000){
      tax = salary*10/100;
      System.out.println(name + " Tax Amount: " + tax + " Tk");
    }
    else{
      tax = salary*30/100;
      System.out.println(name + " Tax Amount: " + tax + " Tk");
    }
  }
  
  public void promoteEmployee(String desig){
    this.desig = desig;
    System.out.println(name + " has been promoted to " + desig);
    if(desig.equals("senior")) salary = salary + 25000;
    else if(desig.equals("lead")) salary = salary + 50000;
    else if(desig.equals("manager")) salary = salary + 75000;
    System.out.println("New Salary: " + salary + " Tk");
  }
}
