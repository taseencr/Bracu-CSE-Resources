//Triangle checker, Area calculator
import java.util.Scanner;

public class task06{
  public static boolean isTriangle(int b, int l, int h){
    return b+l>h && b+h>l && l+h>b;
  }
  
  public static void triArea(int a, int b, int c){
    if(isTriangle(a,b,c)){
      double s = (a+b+c)/2;
      double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
      System.out.printf("%.3f%n", area);
    }
    else System.out.println("Can't form triangle");
  }
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    boolean res = isTriangle(3,2,1); //Values are given here
    System.out.println(res);
    
    triArea(7,5,10);
  }
}