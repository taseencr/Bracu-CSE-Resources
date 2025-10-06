//Reverse the words
import java.util.Scanner;

public class task05{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String text = sc.nextLine();
    String result = "";
    String word = "";
    
    for(int i=0; i<text.length(); i++){
      if(text.charAt(i)==' '){
        result = word + " " + result;
        word = "";
      }
      else word += text.charAt(i);
    }
    
    result = word + " " + result;
    System.out.println(result.trim());
  }
}
