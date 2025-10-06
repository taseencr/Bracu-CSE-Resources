//Subset validator
import java.util.Scanner;

public class p5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr1 [] = null;
    int arr2 [] = null;
    
    for(int i=1; i<=2; i++){
      System.out.print("Please enter the length of array " + i + ": ");
      int n = sc.nextInt();
      int temp [] = new int [n];
      System.out.println("Please enter the elements of the arr" + i + ": ");
      for(int j=0; j<n; j++){
        temp [j] = sc.nextInt();
      }
      if(i==1) arr1 = temp;
      else arr2 = temp;
    }
    
    boolean isSubset = true;
    for(int i=0; i<arr2.length; i++){
      boolean found = false;
      for(int j=0; j<arr1.length; j++){
        if(arr1[j]==arr2[i]){
          found = true;
        }
      }
      if(found==false){
        isSubset = false;
        break;
      }
    }
    
    if(isSubset) System.out.println("Array 2 is a subset of Array 1.");
    else System.out.println("Array 2 is not a subset of Array 1.");
  }
}
