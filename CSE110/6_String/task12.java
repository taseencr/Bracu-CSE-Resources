//Print only unique characters
import java.util.Scanner;

public class task12{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String text = sc.nextLine();
    String result = "";
    
    for(int i=0; i<text.length(); i++){
      char ch = text.charAt(i);
      boolean shouldPrint = true;
      
      for(int j=0; j<i; j++){
        if(ch==text.charAt(j)){
          shouldPrint = false;
          break;
        }
      }
      if(shouldPrint) result += ch;
    }
    
    System.out.println(result);
  }
}
