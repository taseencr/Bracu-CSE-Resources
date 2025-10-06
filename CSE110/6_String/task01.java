//Convert to capital letters
import java.util.Scanner;

public class task01{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String text = sc.nextLine();
    String result = "";
    
    for(int i=0; i<text.length(); i++){
      char ch = text.charAt(i);
      if(ch>='a' && ch<='z'){
        ch = (char)(ch-32);
      }
      result = result+ch;
    }
    
    System.out.println(result);
  }
}
