//Check if a number is divisible by 5, 7, or both
import java.util.Scanner;

public class task1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(num%5==0){
      if(num%7==0){
        System.out.println("Divisible by Both");
      }
      else System.out.println("Invalid: Divisible by 5 Only");
    }
    else if (num%7==0){
      System.out.println("Invalid: Divisible by 7 Only");
    }
    else System.out.println("No");
  }
}
