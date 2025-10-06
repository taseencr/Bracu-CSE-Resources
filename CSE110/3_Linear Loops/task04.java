//Display first n odd numbers and their sum
import java.util.Scanner;

public class task4{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Input number of terms: ");
    int n = sc.nextInt();
    int a = 0;
    int sum = 0;
    System.out.println("The odd numbers are:");
    for(int i=0; i<n; i++){
      a = 2*i+1;
      System.out.println(a);
      sum = sum + a;
    }
    System.out.println("The Sum of odd Natural Numbers up to " + n + " terms is: " + sum);
  }
}
