//abc(abc(abc))abc(abcabcabcabc)->(abcabcabcabc)
import java.util.Scanner;

public class x08{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String txt = sc.nextLine();
    
    int maxStart = -1;
    int maxEnd = -1;
    int max = 0;
    int curstart = -1;
    int openc = 0;
    String result = "";
    
    for(int i=0; i<txt.length(); i++){
      char ch = txt.charAt(i);
      
      if(ch=='('){
        if(openc==0) curstart = i;
        openc++;
      }
      else if(ch==')'){
        if(openc>0){
          openc--;
          if(openc==0){
            int length = i-curstart+1;
            if(length>max){
              max = length;
              maxStart = curstart;
              maxEnd = i;
            }
          }
        }
      }
    }
    
    for(int i=maxStart; i<=maxEnd; i++){
      System.out.print(txt.charAt(i));
    }
  }
}
