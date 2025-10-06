//hellloooo -> helo
import java.util.Scanner;

public class x01{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String text = sc.nextLine();
    String result = "";
    String count = "";
    int product = 1;
    
    for(int i=0; i<text.length(); i++){
      char ch = text.charAt(i);
      int counter = 0;
      if(i>0 && ch==text.charAt(i-1)) continue;
      
      for(int j=i; j<text.length(); j++){
        if(ch==text.charAt(j)){
          counter++;
        }
        else break;
      }
      
      result += ch;
      product *= counter;
      count += counter;
    }
    
    System.out.println(result);
    System.out.println(count);
    System.out.println(product);
  }
}
