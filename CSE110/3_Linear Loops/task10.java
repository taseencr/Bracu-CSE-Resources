//18, -27, 36, -45, 54, -63
import java.util.Scanner;

public class a1{
  public static void main(String[] args){
    int num = 18;
    for(int i=0; i<6; i++){
      if(i%2==0){
        System.out.print(num);
      }
      else System.out.print(-num);
      
      if(i<5){
        System.out.print(", ");
      }
      num += 9;
    }
  }
}
