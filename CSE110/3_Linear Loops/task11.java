//Take numbers and print their squares until a negative is entered
import java.util.Scanner;

public class a2{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    for(int i=0; ; i++){
      System.out.print("Enter Number: ");
      int a = sc.nextInt();
      if(a<0){
        break;
      }
      sum = a*a;
      System.out.println (a + " ^ 2 = " + sum);
    }
  }
}
