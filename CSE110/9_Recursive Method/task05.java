//5 -> 5+4+3+2+1=15
//Hello->olleH
import java.util.Scanner;

public class task05{
  public static int sumDigits(int n){
    if(n<1){
      return 0;
    }
    return n + sumDigits(n-1);
  }
  
  public static String reverse_string(String str, int n){
    if(n>str.length()-1){
      return "";
    }
    return reverse_string(str, n+1) + str.charAt(n);
  }
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int x = sumDigits(5);
    System.out.println(x);
    System.out.println(reverse_string("Hello", 0));
  }
}
