//Find and print the maximum and minimum of three numbers
import java.util.Scanner;

public class task3{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 3 float numbers: ");
    float a = sc.nextFloat();
    float b = sc.nextFloat();
    float c = sc.nextFloat();
    float max, min;
    
    if(a>=b && a>=c){
      max = a;
    }
    else if(b>=a && b>=c){
      max = b;
    }
    else{
      max = c;
    }
    System.out.println("Maximum number is " + max);

    if(a<=b && a<=c){
      min = a;
    }
    else if(b<=a && b<=c){
      min = b;
    }
    else{
      min = c;
    }
    System.out.println("Minimum number is " + min);
  }
}
