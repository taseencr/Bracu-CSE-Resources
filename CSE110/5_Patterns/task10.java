import java.util.Scanner;

public class task10{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    for(int i=1; i<=n; i++){
      for(int k=n-i; k>0; k--){
        System.out.print(" ");
      }
      
      for(int j=1; j<=2*i-1; j++){
        if(i==1||i==n||j==1||j==2*i-1){
          System.out.print(j);
        }
        else System.out.print(" ");
      }
      System.out.println();
    }
  }
}
