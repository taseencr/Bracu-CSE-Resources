public class ProbationAdvisor extends Advisor{
  public String advisee[] = new String[10];
  public int aCount;
  
  public ProbationAdvisor(String name){
    super(name, "Probation");
    count++;
  }
  
  public void advising(String sName, double cg, boolean isLocked){
    if(cg>=2) System.out.println(sName + " is not on probation");
    else{
      if(isLocked) System.out.println("Please unlock the profile first");
      else{
        advisee[aCount] = sName;
        aCount++;
        System.out.println("Advising is complete for " + sName);
      }
    }
  }
  
  public void ClearAllAdviseeInfo(){
    aCount = 0;
    System.out.println("All advisee info is cleared for " + name);
  }
  
  public String toString(){
    String result = super.toString() + "\nTotal Advisee: " + aCount + "\nList: ";
    for(int i=0; i<aCount; i++){
      result += advisee[i] + " ";
    }
    return result;
  }
}
