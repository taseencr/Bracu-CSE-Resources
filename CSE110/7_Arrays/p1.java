//Removing duplicate and replacing with 0
import java.util.Scanner;

public class p1{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr [] = {9, -5, 7, 9, -5, 5, 9, 7};
    
    System.out.println("Before removing duplicates: ");
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i] + " ");
    }
    
    System.out.println();
    
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<i; j++){
        if(arr[i]==arr[j]){
          arr[i]=0;
        }
      }
    }
    
    System.out.println("After replacing duplicates with 0: ");
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i] + " ");
    }
  }
}
