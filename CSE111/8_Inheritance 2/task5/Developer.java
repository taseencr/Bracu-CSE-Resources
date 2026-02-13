public class Developer extends Employee{
  String lang;
  double tSalary;
  
  public Developer(String name, double baseSalary, int hoursWorked, String lang){
    super(name, baseSalary, hoursWorked);
    this.lang = lang;
  }
  
  public void calculateSalary(){
    tSalary = getBaseSalary();
    if(lang.equals("Java")) tSalary += 700;
  }
  
  public void displayInfo(){
    super.displayInfo();
    System.out.println("Language: " + lang);
    System.out.println("Final Salary: $" + tSalary);
  }
}
