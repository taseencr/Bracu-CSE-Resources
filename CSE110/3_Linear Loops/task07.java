//Print digits of a number in reverse order
import java.util.Scanner;

public class task7{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int rem = 0;
    
    if(n<0){
      n = -n;
    }
    if(n==0){
      System.out.print(0);
    }
    
    while(n>0){
      rem = n % 10;
      System.out.print(rem);
      n = n / 10;
      if(n>0){
        System.out.print(", ");
      }
    }
  }
}
