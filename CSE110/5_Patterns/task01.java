import java.util.Scanner;

public class task01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    for(int i=1; i<=n; i++){
      for(int k=0; k<n-i; k++){
        System.out.print(" ");
      }
      for(int j=i; j>0; j--){
        System.out.print(j);
      }
      System.out.println();
    }
  }
}
