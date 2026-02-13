public class Tester {
  public static void main(String args[]) {
    
    System.out.println("Total Advisors: " + Advisor.count);
    
    ProbationAdvisor p1 = new ProbationAdvisor("Saad");
    ProbationAdvisor p2 = new ProbationAdvisor("Reza");
    
    System.out.println("1----------------");
    System.out.println(p1);
    
    System.out.println("2----------------");
    p1.advising("Mithila", 3.5, true);
    p1.advising("Mou", 1.5, true);
    p1.advising("Afra", 1.0, false);
    p1.advising("Zarin", 2.7, false);
    p1.advising("Anika", 1.7, false);
    
    System.out.println("3----------------");
    System.out.println(p1);
    
    System.out.println("4----------------");
    p2.advising("Mim", 1.8, false);
    p2.advising("Maliha", 3.0, false);
    
    System.out.println("5----------------");
    System.out.println(p2);
    
    System.out.println("6----------------");
    p1.clearAdvising();
    
    System.out.println("7----------------");
    System.out.println(p1);
  }
}
