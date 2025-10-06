//Baddadda-dd-n -> Banana
import java.util.Scanner;

public class x09{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine(), s1 = sc.nextLine(), s2 = sc.nextLine();
    String result = "";
    
    for(int i=0; i<s.length(); ){
      boolean match = false;
      int j;
      for(j=0; j<s1.length(); j++){
        if(s1.charAt(j)!=s.charAt(i+j)){
          break;
        }
      }
      if (j==s1.length()) match = true;
      
      if(match){
        result += s2;
        i += s1.length();
      }
      else{
        result += s.charAt(i);
        i++;
      }
    }
    System.out.println(result);
  }
}
