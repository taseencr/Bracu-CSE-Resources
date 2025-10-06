//Print first n prime numbers
import java.util.Scanner;

public class a5{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    
    if(n>0){
      for(int i=2; count<n; i++){
        int divcount = 0;
        for(int j=1; j<=i; j++){
          if(i%j==0){
            divcount++;
          }
        }
        if(divcount==2){
          System.out.println(i);
          count++;
        }
      }
    }
  }
}
