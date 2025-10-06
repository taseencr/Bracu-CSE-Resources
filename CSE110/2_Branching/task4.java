//Determine the type of triangle based on side lengths
import java.util.Scanner;

public class task4{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the side lengths of the triangle: ");
    float a = sc.nextFloat();
    float b = sc.nextFloat();
    float c = sc.nextFloat();
    
    if(a==b && b==c){
      System.out.println("This is a Equilateral triangle");
    }
    else if(a==b || b==c || c==a){
      System.out.println("This is a Isosceles triangle");
    }
    else System.out.println("This is a Scalene triangle");
  }
}
