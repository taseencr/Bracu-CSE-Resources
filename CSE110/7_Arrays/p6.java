//Element finder
import java.util.Scanner;

public class p6{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("N = ");
    int n = sc.nextInt();
    int arr [] = new int [n];
    
    for(int i=0; i<arr.length; i++){
      System.out.print("Enter a number: ");
      arr[i] = sc.nextInt();
    }
    
    int a = sc.nextInt();
    int index = -1;
    
    for(int i=0; i<arr.length; i++){
      if(arr[i]==a){
        index = i;
        break;
      }
    }
    
    if(index>-1) System.out.println(a + " is at index " + index);
    else System.out.println("Element not found");
  }
}
