import java.util.Scanner;

public class lq2{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of employees: ");
    int n = sc.nextInt();
    System.out.print("Enter your company's budget: ");
    int budget = sc.nextInt();
    int sum = 0;
    
    for(int i=1; i<=n; i++){
      sc.nextLine();
      System.out.print("Enter the name of employee-" + i + ": ");
      String name = sc.nextLine();
      System.out.print("Enter the salary of " + name + ": ");
      int salary = sc.nextInt();
      sum = sum + salary;
      
      if(sum > budget){ //If total salary exceeds the company budget, the loop will break;
        System.out.println("Budget exceeded!");
        break;
      }
      
      if(salary>budget*60/100){
        System.out.println(name + ": High Salary.");
      }
      else if(salary>budget*30/100){
        System.out.println(name + ": Mid Salary.");
      }
      else System.out.println(name + ": Low Salary");
    }
    
    System.out.println("Total salary: " + sum);
  }
}
