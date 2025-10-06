//Calculate and print sine and cosine of angles in a right-angled triangle
public class task5{
  public static void main(String[] args){
    double a = 4.5;
    double b = 9.5;
    double c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
    System.out.println("The value of sin(A) is: " + a/c);
    System.out.println("The value of cos(A) is: " + b/c);
    System.out.println("The value of sin(B) is: " + b/c);
    System.out.println("The value of cos(B) is: " + a/c);
  }
}
