public class ProbationAdvisor extends Advisor{
  String advisee[] = new String[5];
  int counter;
  
  public ProbationAdvisor(String name){
    super(name, "Probation");
    count++;
  }
  
  public void advising(String name, double cg, boolean isLocked){
    if(cg<2){
      if(isLocked) System.out.println("Please unlock the profile first");
      else{
        advisee[counter] = name;
        counter++;
        System.out.println("Advising is complete for " + name);
      }
    }
    else System.out.println(name + " is not on probation");
  }
  
  public void clearAdvising(){
    for(int i=0; i<counter; i++){
      advisee[i] = null;
    }
    counter = 0;
    System.out.println("All advisee info is cleared for " + name);
  }
  
  public String toString(){
    String s = super.toString();
    s += "\nTotal Advisee: " + counter + "\nList: ";
    for(int i=0; i<counter; i++){
      s += advisee[i] + " ";
    }
    return s;
  }
}
