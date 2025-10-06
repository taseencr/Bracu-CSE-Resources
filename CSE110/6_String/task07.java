//mAkE lIkE tHiS
import java.util.Scanner;

public class task07{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String text = sc.nextLine();
    String result = "";
    boolean makeLower = true;
    
    for(int i=0; i<text.length(); i++){
      char ch = text.charAt(i);
      if(Character.isLetter(ch)){
        if(makeLower){
          ch = Character.toLowerCase(ch);
        }
        else ch = Character.toUpperCase(ch);
        result += ch;
        makeLower = !makeLower;
      }
      else result += ch;
    }
    
    System.out.println(result);
  }
}
