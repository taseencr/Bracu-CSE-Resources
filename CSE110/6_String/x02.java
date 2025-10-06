//Max ascii value word finder
import java.util.Scanner;

public class x02{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String text = sc.nextLine();
    String result = "";
    String part = "";
    int max = 0;
    int temp = 0;
    
    for(int i=0; i<text.length(); i++){
      char ch = text.charAt(i);
      if(ch==' '){
        if(temp>max){
          max = temp;
          result = part;
        }
        part = "";
        temp = 0;
      }
      else{
        part += ch;
        temp += (int) ch;
      }
    }
    
    if(temp>max){
      max = temp;
      result = part;
    }
    
    System.out.println(result);
    System.out.println(max);
  }
}
