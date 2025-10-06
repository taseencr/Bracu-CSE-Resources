//Even and Odd number sequence
import java.util.Scanner;

public class task04{
  public static void evenChecker(int n){
    if(n%2==0) System.out.println("Even!!");
    else System.out.println("Odd!!");
  }
  
  public static boolean isEven(int n){
    return n%2==0;
  }
  
  public static boolean isPos(int n){
    return n>0;
  }
  
  public static void sequence(int n){
    if(isPos(n)){
      for(int i=0; i<=n; i++){
        if(isEven(i)){
          System.out.print(i + " ");
        }
      }
    }
    else{
      for(int i=n; i<=-1; i++){
        if(!isEven(i)){
          System.out.print(i + " ");
        }
      }
    }
  }
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    sequence(-8); //Value given here
  }
}