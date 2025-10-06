import java.util.Scanner;

public class task2{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int length = sc.nextInt();
    int width = sc.nextInt();
    
    for(int i=1; i<=width; i++){
      for(int j=1; j<=length; j++){
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}