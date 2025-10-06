//Print digits of a number in original order with commas
import java.util.Scanner;

public class task8{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int temp = n;
    int count = 0;
    int rem = 0;
    int x = 1;
    
    if(n<0){
      n = -n;
    }
    if(n==0){
      System.out.print(0);
    }
    
    while(temp>0){
      temp = temp / 10;
      count++;
    }
    
    for(int i=1; i<count; i++){
      x = x*10;
    }
    while(x>0){
      rem = n/x;
      System.out.print(rem);
      n = n % x;
      x = x/10;
      if(n>0){
        System.out.print(" ,");
      }
    }
  }
}
