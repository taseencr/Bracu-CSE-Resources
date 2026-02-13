public class Company{
  String name = "ABC Company";
  Employee emp[] = new Employee[3];
  int count;
  
  public void details(){
    System.out.println("Company Name: " + name);
    System.out.println("Total Employee: " + count);
    System.out.println("Fulltime Employees: ");
    for(int i=0; i<count; i++){
      if(emp[i].type.equals("Fulltime")){
        System.out.println("Name: " + emp[i].name + ", ID: " + emp[i].id);
      }
    }
    System.out.println("Part-Time Employees: ");
    for(int i=0; i<count; i++){
      if(emp[i].type.equals("Part-time")){
        System.out.println("Name: " + emp[i].name + ", ID: " + emp[i].id);
      }
    }
  }
  
  public void addEmployee(Employee obj){
    if(count<3){
      emp[count] = obj;
      count++;
      System.out.println(obj.name + " has joined the company");
    }
    else System.out.println("No more vacancy");
  }
  
  public void removeEmployee(Employee obj){
    int ind = -1;
    for(int i=0; i<count; i++){
      if(obj==emp[i]){
        ind = i;
      }
    }
    if(ind!=-1){
      for(int i=ind; i<count-1; i++){
        emp[i] = emp[i+1];
      }
      count--;
      System.out.println(obj.name + " has left the company");
    }
  }
}

