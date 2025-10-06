//Count positive and negative numbers from user input
import java.util.Scanner;

public class task3{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int n = sc.nextInt();
    int pcount = 0;
    int ncount = 0;
    
    for(int i=1; i<=n; i++){
      System.out.print("Enter number " + i + ": ");
      int a = sc.nextInt();
      if(a>=0){
        pcount++;
      }
      else if(a<0){
        ncount++;
      }
    }
    System.out.println(pcount + " Non-negative Numbers");
    System.out.println(ncount + " Negative Numbers");
  }
}
