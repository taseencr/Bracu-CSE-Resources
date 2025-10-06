//Character increaser
import java.util.Scanner;

public class task11{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String text = sc.nextLine();
    String result = "";
    
    for(int i=0; i<text.length(); i++){
      char ch = text.charAt(i);
      if(ch=='z') result += 'a';
      else result += (char)(ch+1);
    }
    
    System.out.println(result);
  }
}
