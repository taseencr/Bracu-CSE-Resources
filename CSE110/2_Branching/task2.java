//Calculate tax based on age and salary
import java.util.Scanner;

public class task2{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your salary: ");
    int salary = sc.nextInt();
    System.out.println("Enter your age: ");
    int age = sc.nextInt();
    int tax = 0;
    
    if(age>=18){
      if(salary<10000){
        tax = salary*0;
      }
      else if(salary>=10000 && salary<=20000){
        tax = salary*5/100;
      }
      else{
        tax = salary*10/100;
      }
      System.out.println("Your tax amounts in " + tax + " Tk");
    }
    else System.out.println("Your tax amounts in " + tax + " Tk");
  }
}
