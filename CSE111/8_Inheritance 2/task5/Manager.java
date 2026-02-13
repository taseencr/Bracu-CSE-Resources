public class Manager extends Employee{
  double bonus;
  double tSalary;
  
  public Manager(String name, double baseSalary, int hoursWorked, double bonus){
    super(name, baseSalary, hoursWorked);
    this.bonus = bonus;
  }
  
  public void calculateSalary(){
    if(getHoursWorked()>40) bonus = 10;
    tSalary = getBaseSalary() + getBaseSalary()*bonus/100;
  }
  
  public void displayInfo(){
    super.displayInfo();
    System.out.println("Bonus: " + bonus + " %");
    System.out.println("Final Salary: $" + tSalary);

  }
  
  public void requestIncrement(int inc){
    if(getHoursWorked()>100){
      setBaseSalary(getBaseSalary()+inc);
      System.out.println("$" + inc + " Increment approved.");
    }
    else if(getHoursWorked()>80){
      setBaseSalary(getBaseSalary()+inc*.5);
      System.out.println("$" + (int)(inc*.5) + " Increment approved.");
    }
    else System.out.println("Increment denied.");
  }
}
