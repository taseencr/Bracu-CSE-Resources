//Reverse an array
import java.util.Scanner;

public class p2{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of the array: ");
    int n = sc.nextInt();
    int arr [] = new int [n];
    
    for(int i=0; i<n; i++){
      System.out.print("Enter a number: ");
      arr [i] = sc.nextInt();
    }
    
    System.out.println("Reversed using a new array: ");
    int newarr [] = new int [n];
    for(int i=0; i<n; i++){
      newarr[i] = arr[n-1-i];
      System.out.print(newarr[i] + " ");
    }
    
    System.out.println();
    
    System.out.println("Reversed the original array: ");
    for(int j=0; j<n/2; j++){
      int temp = arr[j];
      arr[j] = arr[n-1-j];
      arr[n-1-j] = temp;
    }
    for(int i=0; i<n; i++){
      System.out.print(arr[i] + " ");
    }
  }
}
