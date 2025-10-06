//Print all prime numbers between the given start and end values
import java.util.Scanner;

public class task3{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Start: ");
    int start = sc.nextInt();
    System.out.print("End: ");
    int end = sc.nextInt();
    
    for(int i=start; i<=end; i++){
      int count = 0;
      for(int j=1; j<=i; j++){
        if(i%j==0){
          count++;
        }
      }
      if(count==2){
        System.out.println(i);
      }
    }
  }
}
