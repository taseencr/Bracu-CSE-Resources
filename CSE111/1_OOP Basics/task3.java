import java.util.Scanner;

public class task3{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("N = ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    
    for(int i=0; i<arr.length; i++){
      arr[i] = sc.nextInt();
    }
    
    for(int i=0; i<arr.length; i++){
      int a = arr[i];
      int count = 0;
      boolean isDuplicate = false;
      for(int j=0; j<i; j++){
        if(arr[j]==a) isDuplicate = true;
      }
      for(int k=0; k<arr.length; k++){
        if(arr[k]==a) count++;
      }
      if(!isDuplicate) System.out.println(a + " - " + count + " times");
    }
  }
}
