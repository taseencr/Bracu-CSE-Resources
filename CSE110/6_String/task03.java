//Splitter
import java.util.Scanner;

public class task03{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String text = sc.nextLine();
    String x = sc.next();
    char splitter = x.charAt(0);
    String part = "";
    
    for(int i=0; i<text.length(); i++){
      char ch = text.charAt(i);
      if(ch==splitter){
        System.out.println(part);
        part = "";
      }
      else part += ch;
    }
    System.out.println(part);
  }
}
