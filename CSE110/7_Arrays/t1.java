import java.util.Scanner;

public class t1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String planets[] = {"Mercury", "Venus", "Earth", "Mars", "Jupiter"};
    double[] x_coordinates = {0.39, 0.72, 1.00, 1.52, -5.20};
    double[] y_coordinates = {0.24, 0.00, 0.00, 0.99, 2.86};
    double[] z_coordinates = {-0.10, 0.44, -0.02, 0.21, 0.42};
    String str = sc.nextLine();
    double dis = Double.MAX_VALUE;
    int pos = -1;
    int idx = -1;
    
    for(int i=0; i<planets.length; i++){
      if(str.equals(planets[i])){
        idx = i;
        break;
      }
    }
    
    if(idx>=0){
      for(int i=0; i<planets.length; i++){
        if(i==idx) continue;
        double temp = Math.pow(x_coordinates[idx]-x_coordinates[i],2) + Math.pow(y_coordinates[idx]-y_coordinates[i],2) + Math.pow(z_coordinates[idx]-z_coordinates[i],2);
        if(temp<dis){
          dis = temp;
          pos = i;
        }
      }
      if(pos>=0){
        System.out.println("Closest Planet: " + planets[pos]);
        System.out.printf("Distance: %.4f%n", dis);
      }
    }
    else System.out.println("Invalid Input");
  }
}
