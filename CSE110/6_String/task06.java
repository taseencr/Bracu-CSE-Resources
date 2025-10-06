//Unique character finder
import java.util.Scanner;

public class task06{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String text1 = sc.nextLine();
    String text2 = sc.nextLine();
    String result = "";
    
    for(int i=0; i<text1.length(); i++){
      char ch = text1.charAt(i);
      if(text2.indexOf(ch)==-1){
        result += ch;
      }
    }
    
    for(int j=0; j<text2.length(); j++){
      char ch = text2.charAt(j);
      if(text1.indexOf(ch)==-1){
        result += ch;
      }
    }
    
    System.out.println(result.toUpperCase());
  }
}
