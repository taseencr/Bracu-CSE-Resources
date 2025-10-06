import java.util.Scanner;

public class task06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    
    for(int i=1; i<=a; i++){      
      for(int j=1; j<=i; j++){
        if(i>2 && i<a && j>1 && j<i){
          System.out.print(" ");
        }
        else System.out.print(j);
      }
      System.out.println();
    }
  }
}
