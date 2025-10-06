import java.util.Scanner;

public class task09{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    for(int i=n; i>0; i--){
      for(int k=i-1; k>0; k--){
        System.out.print(" ");
      }
      
      for(int j=i; j<=n; j++){
        if(j==i||j==n||i==n||i==1){
          System.out.print(j);
        }
        else System.out.print(" ");
      }
      System.out.println();
    }
  }
}
