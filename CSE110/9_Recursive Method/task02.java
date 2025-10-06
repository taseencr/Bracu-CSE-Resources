//Power
import java.util.Scanner;

public class task02{
  public static int power(int b, int e){
    if(e<1){
      return 1;
    }
    return b*power(b, e-1);
  }
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int b = sc.nextInt();
    int e = sc.nextInt();
    
    int x = power(b,e);
    System.out.println(x);
  }
}
