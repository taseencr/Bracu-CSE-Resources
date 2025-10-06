//Remove a number from the array
import java.util.Scanner;

public class p7{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("N = ");
    int n = sc.nextInt();
    int counter = 0;
    int [] arr = new int[n];
    
    for(int i=0; i<arr.length; i++){
      System.out.print("Enter a number: ");
      arr[i] = sc.nextInt();
    }
    
    System.out.print("Remove Element = ");
    int rem = sc.nextInt();
    
    System.out.println("Input array: ");
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i] + " ");
      if(arr[i]==rem){
        counter++;
      }
    }
    
    int narr [] = new int [n-counter];
    int newIndex = 0;
    for(int i=0; i<arr.length; i++){
      if(arr[i]!=rem){
        narr[newIndex] = arr[i];
        newIndex++;
      }
    }
    
    System.out.println();
    System.out.println("New array: ");
    for(int i=0; i<narr.length; i++){
      System.out.print(narr[i] + " ");
    }
  }
}
