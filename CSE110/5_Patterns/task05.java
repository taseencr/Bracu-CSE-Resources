import java.util.Scanner;

public class task05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    for(int i=1; i<=a; i++){
      for(int j=1; j<=b; j++){
        if(i>1 && i<a && j>1 && j<b){
          System.out.print(" ");
        }
        else System.out.print(j);
      }
      
      System.out.println();
    }
  }
}
