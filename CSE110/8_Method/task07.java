//Find the index number of an array element
import java.util.Scanner;

public class task07{
  public static int indexFinder(int arr[], int n){
    for(int i=0; i<arr.length; i++){
      if(arr[i]==n){
        return i;
      }
    }
    return -1;
  }
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int arr[] = {7, 11, 87, 4 ,-2};
    int index = indexFinder(arr, 87);
    System.out.println("Index = " + index);
  }
}