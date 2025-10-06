//Print all Armstrong numbers between the given start and end values
import java.util.Scanner;

public class task5{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Start: ");
    int start = sc.nextInt();
    System.out.print("End: ");
    int end = sc.nextInt();
    
    System.out.println("Armstrong numbers: ");
    for(int i=start; i<=end; i++){
      int temp = i;
      int num = i;
      int digits = 0;
      int sum = 0;
      
      while(temp>0){
        digits++;
        temp = temp/10;
      }
      
      while(num>0){
        int x = num%10;
        sum += Math.pow(x,digits);
        num = num/10;
      }
      
      if(sum==i){
        System.out.println(i);
      }
    }
  }
}
