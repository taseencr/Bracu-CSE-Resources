//Max-min value
import java.util.Scanner;

public class p3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of the array: ");
    int n = sc.nextInt();
    float arr [] = new float [n];
    
    for(int i=0; i<n; i++){
      System.out.print("Enter a number: ");
      arr[i] = sc.nextFloat();
    }
    
    float sum = 0;
    int maxInd = 0, minInd = 0;
    float max = arr[0];
    float min = arr[0];
    for(int j=0; j<n; j++){
      if(max<arr[j]) {max = arr[j]; maxInd = j;}
      if(min>arr[j]) {min = arr[j]; minInd = j;}
      sum += arr[j];
    }
    float avg = sum/n;
    
    System.out.println("Maximum element " + max + " found at index " + maxInd);
    System.out.println("Minimum element " + min + " found at index " + minInd);
    System.out.println("Summation: " + sum);
    System.out.println("Average: " + avg);
  }
}
