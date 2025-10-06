//Calculate alternating sum of squares up to n
import java.util.Scanner;

public class a3{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    for(int i=1; i<=n; i++){
      if(i%2==1){
        sum = sum + i*i;
      }
      else sum = sum - i*i;
    }
    System.out.println(sum);
  }
}
