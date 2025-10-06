//Calculate negative sum of first n natural number sums
import java.util.Scanner;

public class a6{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("The value of N: ");
    int n = sc.nextInt();
    int sum = 0;
    
    for(int i=1; i<=n; i++){
      int num = 0;
      for(int j=1; j<=i; j++){
        num = num + j;
      }
      sum = sum - num;
    }
    System.out.println("The value of y: " + sum);
  }
}
