//New array with only the unique elements
import java.util.Scanner;

public class p4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr [] = {23, 100, 23, 56, 100};
    int newarr [] = new int [arr.length];
    
    int count = 0;
    for(int i=0; i<arr.length; i++){
      boolean isDuplicate = false;
      
      for(int j=0; j<count; j++){
        if(newarr[j]==arr[i]){
          isDuplicate = true;
          break;
        }
      }
      
      if(!isDuplicate){
        newarr[count] = arr[i];
        count++;
      }
    }
  
    System.out.println("New array: ");
    for(int i=0; i<count; i++){
      System.out.print(newarr[i] + " ");
    }
  }
}
