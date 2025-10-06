import java.util.Scanner;

public class task05{
  public static double circleArea(int r){
    return 3.141592*r*r;
  }
  
  public static double sphereVolume(double r){
    return 4*3.141592*r*r*r/3;
  }
  
  public static void findSpace(int d, String par){
    if(par.equals("circle")) System.out.printf("%.4f%n", circleArea(d/2));
    else if(par.equals("sphere")) System.out.printf("%.4f%n", sphereVolume(d/2));
    else System.out.println("Wrong Parameter");
  }
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    double volume = sphereVolume(5.0); //Values are given here
    System.out.printf("%.4f%n", volume);

    findSpace(10, "circle");
  }
}
