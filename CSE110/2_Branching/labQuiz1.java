//Simulate game purchase and check remaining balance rules
import java.util.Scanner;

public class labQuiz1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your balance: ");
    int balance = sc.nextInt();
    System.out.print("Choose a game: ");
    int n = sc.nextInt();
    
    int rem=0;
    if(n==1){rem = balance - 100;}
    else if(n==2){rem = balance - 120;}
    else if(n==3){rem = balance - 150;}
    else if(n==4){rem = balance - 200;}
    
    if(rem>=0){
      System.out.println("Congratulations, your purchase successful!");
      if(rem%3==0){
        System.out.print("Your remaining balance is: " + rem + " Taka");
      }
      else{
        System.out.println("Your remaining balance is not divisible by 3");
        System.out.print("Choose another game: ");
        int m = sc.nextInt();
        int rem1=0;
        
        if(m==1){rem1 = rem - 100;}
        else if(m==2){rem1 = rem - 120;}
        else if(m==3){rem1 = rem - 150;}
        else if(m==4){rem1 = rem - 200;}
        
        if(rem1>=0){
        System.out.println("Purchase successful.");
        System.out.println("Your remaining balance is: " + rem1 + " Taka");
        }
        else System.out.println("Insufficient balance");
      }
    }
    else System.out.println("Insufficient balance");
  }
}