//Check if sum of first and last digits equals sum of inner digits
import java.util.Scanner;

public class q2{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Code: ");
    int code = sc.nextInt();
    
    int lastDigit = code % 10;
    code = code / 10;
    int innerSum = 0;
    int outerSum = 0;
    
    while(code>=10){
      int digit = code % 10;
      innerSum = innerSum + digit;
      code = code / 10;
    }
    
    int firstDigit = code;
    outerSum = firstDigit + lastDigit;
    
    if(innerSum == outerSum){
      System.out.println("The Gauntlet is activated!");
    }
    else System.out.println("The Gauntlet is still dormant.");
  }
}
