import java.util.Scanner;

public class task1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    for(int i=0; i<N; i++){
      int X = sc.nextInt();
      int Y = sc.nextInt();
      int sum = 0;
      
      if(X%2==0){
        X++;
      }
      
      for(int j=0; j<Y; j++){
        sum = sum + X;
        X+=2;
      }
      System.out.println(sum);
    }
  }
}