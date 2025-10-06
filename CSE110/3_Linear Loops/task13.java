//Count the number of digits in a given number
import java.util.Scanner;

public class a4{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n < 0){
      n = -n;
    }
    else if (n == 0){
      System.out.println("Total digits = 1");
    }
    
    int count = 0;
    for(; n>0; n=n/10){
      count++;
    }
    System.out.println("Total digits = " + count);
  }
}
