//Count divisors of even numbers until an odd number is entered
import java.util.Scanner;

public class a7{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    for(int i=0; ; i++){
      int count = 0;
      System.out.print("Enter Number: ");
      int n = sc.nextInt();
      
      if(n%2!=0){
        break;
      }
      
      for(int j=1; j<=n; j++){
        if(n%j==0){
          count++;
        }
      }
      System.out.println(n + " has " + count + " divisors");
    }
  }
}
