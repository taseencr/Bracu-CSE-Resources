import java.util.Scanner;

public class task03{
  public static double calcTax(int age, int salary){
    if(age<18 || salary<10000) return 0.0;
    else if(salary>=10000 && salary<=20000) return salary*7/100;
    else return salary*14/100;
  }
  
  public static void calcYearlyTax(){
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    double totalTax = 0;
    
    for(int i=1; i<=12; i++){
      int salary = sc.nextInt();
      double tax = calcTax(age, salary);
      totalTax += tax;
      System.out.println("Month" + i + " tax: " + tax);
    }
    System.out.println("Total Yearly Tax: " + totalTax);
  }
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    calcYearlyTax();
  }
}
