//How many time each number appears
import java.util.Scanner;

public class p8{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("N = ");
    int n = sc.nextInt();
    int arr[] = new int [n];
    
    for(int i=0; i<n; i++){
      System.out.print("Enter a number: ");
      arr[i] = sc.nextInt();
    }
    
    for(int i=0; i<n; i++){
      boolean isDuplicate = false;
      int count = 0;
      
      for(int j=0; j<i; j++){
        if(arr[j]==arr[i]){
          isDuplicate = true;
          break;
        }
      }
      
      if(!isDuplicate){
        for(int j=0; j<n; j++){
          if(arr[i]==arr[j]){
            count++;
          }
        }
        System.out.println(arr[i] + " - " + count + " times");
      }
    }
  }
}