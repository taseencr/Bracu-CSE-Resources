//Read 10 numbers and display running sum
import java.util.Scanner;

public class task5{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    for(int i=0; i<10; i++){
      System.out.print("Enter Number: ");
      int n = sc.nextInt();
      sum = sum + n;
      System.out.println("Sum = " + sum);
    }
  }
}
