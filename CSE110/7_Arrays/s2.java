//Sorting using Selection sort
import java.util.Scanner;

public class s2{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int [] number = {85, 90, 75, 44, 99};
    int n = number.length;
    
    System.out.println("Original Array: ");
    for(int i=0; i<n; i++){
      System.out.print(number[i] + " ");
    }
    
    System.out.println();
    
    System.out.println("Sorted Array: ");
    for(int i=0; i<n-1; i++){
      int max = i;
      for(int j=i+1; j<n; j++){
        if(number[j]>number[max]){
          max = j;
        }
      }
      int temp = number[i];
      number[i] = number[max];
      number[max] = temp;
    }
    
    for(int i=0; i<n; i++){
      System.out.print(number[i] + " ");
    }
  }
}
