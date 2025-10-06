//Pattern generate
import java.util.Scanner;

public class task02{
  public static void showDots(int n){
    String result = "";
    for(int i=0; i<n; i++){
      result += ".";
    }
    System.out.print(result);
  }
  
  public static void show_palindrome(int n){
    String result = "";
    for(int i=1; i<=n; i++){
      result += i;
    }
    for(int i=n-1; i>0; i--){
      result += i;
    }
    System.out.print(result);
  }
  
  public static void showDiamond(int n){
    for(int i=1; i<=n; i++){
      showDots(n-i);
      show_palindrome(i);
      showDots(n-i);
      System.out.println();
    }
    for(int i=n-1; i>0; i--){
      showDots(n-i);
      show_palindrome(i);
      showDots(n-i);
      System.out.println();
    }
  }
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    showDots(n);
    System.out.println();
    show_palindrome(n);
    System.out.println();
    showDiamond(n);
  }
}
