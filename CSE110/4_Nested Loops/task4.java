//Calculate and print average item cost for each customer
import java.util.Scanner;

public class task4{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Number of Customer: ");
    int n = sc.nextInt();
    
    for(int i=1; i<=n; i++){
      int a = 0;
      double sum = 0;
      System.out.print("Item Number for Customer-" + i + ": ");
      int k = sc.nextInt();
      for(int j=1; j<=k; j++){
        System.out.print("Item-" + j + ": ");
        a = sc.nextInt();
        sum = sum + a;
      }
      double avg = sum/k;
      
      System.out.println("Average for Customer-" + i + ": " + avg);
    }
  }
}
