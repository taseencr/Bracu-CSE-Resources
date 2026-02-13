public class Varsity{
  public static void main(String[] args){
    Department b1 = new Department();
    Department b2 = new EEEDept();
    Department b3 = new SoftwareDept();
    CSEDept c1 = new SoftwareDept ();
    CSEDept c2 = new CSEDept();
    Object o1 = new EEEDept();
    Department o2 = new RoboticsDept();
    
    
    
    
    
//     c2.task2();
//     b3.task1();
//     System.out.println(b3);
//     ((CSEDept)b1).task1();
//     System.out.println(((Object)b2).chant);
//     ((Department)b2).advising();
//     ((CSEDept)b2).task2();
//     ((EEEDept)b2).task2();
//     System.out.println((CSEDept)b3);
//     System.out.println(((Department)c1).chant);
//     ((Object)c1).toString();
//     System.out.println(((Department)c2));
//     System.out.println(((Department)o1));
//     ((EEEDept)o2).advising();
//     ((SoftwareDept)o2).task1();
  }
}


class Department{
  public String chant = "I love my Department!";
  public void task1(){
    System.out.println(chant);
  }
  public void task2(){
    task1();
    System.out.println("Doing Task 2 "+ chant);
  }
  public void advising(){
    System.out.println("Advising is Pain.");
  }
  public String toString(){
    advising();
    return chant;
  }
}
class CSEDept extends Department{
  public String chant = "CSE is Love.";
  public void task2(){
    System.out.println("Doing Task 2 "+ chant);
  }
  public void advising(){
    System.out.println("Advising is Pain.");
  }
}
class EEEDept extends Department{
  public String chant = "Help.";
  public void task1(){
    System.out.println("Doing Task 1 "+ chant);
  }
  public void advising(){
    super.advising();
    System.out.println(chant);
  }
  public String toString(){
    task2();
    return chant;
  }
}
class SoftwareDept extends CSEDept{
  public String chant = "Software is fun!";
  public String toString(){
    advising();
    return chant;
  }
  public void task1(){
    System.out.println("Doing Task 1 "+ chant);
    task2();
  }
}
class RoboticsDept extends EEEDept{
  public String chant = "New Department woohoo!";
  public void task2(){
    System.out.println("Doing Task 2 "+ chant);
  }
  public void advising(){
    super.advising();
    task1();
    System.out.println(chant); 
  }
}
