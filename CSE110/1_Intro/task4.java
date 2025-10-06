//Calculate and print area and circumference of a hexagon
public class task4{
  public static void main(String[] args){
    double a = 8;
    double b = 3;
    double c = Math.sqrt(Math.pow(a/2,2)+Math.pow(b,2));
    double area = 3*Math.sqrt(3)*Math.pow(c,2)/2;
    double circum = 6*c;
    System.out.println("The area of the Hexagon is: " + area + "\nThe circumference of the Hexagon is: " + circum);
  }
}
