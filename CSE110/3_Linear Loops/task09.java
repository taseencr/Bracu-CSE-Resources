//Check if a number is prime and perfect
import java.util.Scanner;

public class task9{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    int sum = 0;
    for(int i=1; i<=n; i++){
      if(n%i==0){
        count++;
        sum = sum + i;
      }
    }
    if(count==2){
      System.out.println(n + " is a prime number");
    }
    else System.out.println(n + " is not a prime number");
    
    if(sum-n==n){
      System.out.println(n + " is a perfect number");
    }
    else System.out.println(n + " is not a perfect number");
  }
}
