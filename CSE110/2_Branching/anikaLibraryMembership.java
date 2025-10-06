import java.util.Scanner;

public class anikaLibraryMembership{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    //Take input
    System.out.print("Enter your age: ");
    int age = sc.nextInt();
    System.out.print("Enter number of months of membership: ");
    int months = sc.nextInt();
    
    //Basic monthly fee according to age -> For age below 18- 100tk, 18to60- 250tk, 60 up- 150tk.
    int fee = 0;
    if(age<18){
      fee = 100;
    }
    else if(age>=18 && age<=60){
      fee = 250;
    }
    else fee = 150;
    
    //Total fee after the discounts -> For the first 3months- 0% discount, next 6months- 30% discount, after 9months- 90%discount.
    int total = 0;
    if (months<=3){
      total = fee * months;
    }
    else if (months<=9){
      total = 3*fee + (months-3)*fee*70/100;
    }
    else{
      total = 3*fee + 6*fee*70/100 + (months-9)*fee*10/100;
    }
    
    System.out.println("The total cost is: " + total);
  }
}
