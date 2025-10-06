import java.util.Scanner;

public class task13{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    for(int i=n; i>0; i--){
      for(int k=0; k<n-i; k++){
        System.out.print(" ");
      }
      
      for(int j=1; j<=i; j++){
        System.out.print(j);
      }
      for(int k=i-1; k>0; k--){
        System.out.print(k);
      }
      System.out.println();
    }
  }
}
