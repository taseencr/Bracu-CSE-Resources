import java.util.Scanner;

public class task14{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    for(int i=n; i>=1; i-=2){
      for(int k=0; k<(n-i)/2; k++){
        System.out.print(" ");
      }
      
      for(int j=1; j<=i; j++){
        System.out.print(j);
      }
      System.out.println();
    }
    
    for(int i=3; i<=n; i+=2){
      for(int k=(n-i)/2; k>0; k--){
        System.out.print(" ");
      }
      for(int j=1; j<=i; j++){
        System.out.print(j);
      }
      System.out.println();
    }
  }
}
