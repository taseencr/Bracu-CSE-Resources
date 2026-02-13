import java.util.Scanner;

public class task1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int count = 0;
    
    if(a>b){
      int temp = b;
      b = a;
      a = temp;
    }
    
    for(int i=a; i<=b; i++){
      int counter = 0;
      for(int j=1; j<i; j++){
        if(i%j==0) counter++;
      }
      if(counter<2) count++;
    }
    System.out.println("There are " + count + " prime numbers between " + a + " and " + b + ".");
  }
}