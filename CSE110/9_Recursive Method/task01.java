//Factorial
import java.util.Scanner;

public class task01{
  public static int factorial(int n){
    if(n<1){
      return 1;
    }
    return n*factorial(n-1);
  }
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int x = factorial(n);
    System.out.println(x);
  }
}
