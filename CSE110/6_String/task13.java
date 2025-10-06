//Consecutive duplicate char finder
import java.util.Scanner;

public class task13{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String text = sc.nextLine();
    
    for(int i=0; i<text.length(); i++){
      char ch = text.charAt(i);
      int count = 0;
      if(i>0 && ch==text.charAt(i-1)) continue;
      
      for(int j=i; j<text.length(); j++){
        if(ch==text.charAt(j)){
          count++;
        }
        else break;
      }
      
      if(count>1){
        System.out.println(ch + " - " + count);
      }
    }    
  }
}
