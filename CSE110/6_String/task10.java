//Reverse till the input index
import java.util.Scanner;

public class task10{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String text = sc.nextLine();
    int ind = sc.nextInt();
    String result = "";
    
    for(int i=ind; i>=0; i--){
      char ch = text.charAt(i);
      result += ch;
    }
    
    for(int i=ind+1; i<text.length(); i++){
      char ch = text.charAt(i);
      result += ch;
    }
    
    System.out.println(result);
  }
}
