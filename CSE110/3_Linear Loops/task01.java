//Print numbers up to n divisible by 5 but not by 3
import java.util.Scanner;

public class task1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n>0){
      for(int i=0; i<=n; i++){
        if(i%5==0 && i%3!=0){
          System.out.println(i);
        }
      }
    }
  }
}
