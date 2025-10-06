//banana -> ba; aabbcc -> No; giggling -> ggln
import java.util.Scanner;

public class x04{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String res = "";
    
    for(int i=0; i<s.length(); i++){
      char ch = s.charAt(i);
      int rep = 0;
      int first = -1;
      int last = -1;
      
      for(int j=0; j<s.length(); j++){
        if(s.charAt(j)==ch){
          rep++;
          if(first==-1) first = j;
          last = j;
        }
      }

      if(rep==1 || (i!=first && i!=last)){
        res += ch;
      }
    }
    
    if(res.equals("")){
      System.out.println("No characters left!");
    }
    else{
      System.out.println(res);
    }
  }
}
