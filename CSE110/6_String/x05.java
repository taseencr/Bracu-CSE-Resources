public class x05{
  public static String charShifter(String str, int n){
    String result = "";
    
    for(int i=0; i<str.length(); i++){
      char ch = str.charAt(i);
      if(ch>='a' && ch<='z'){
        char temp = (char) (ch-n);
        if(temp<'a'){
          temp = (char) (temp+26);
        }
        result += temp;
      }
      else result += ch;
    }
    return result;
  }
  
  public static void main(String[] args){
    String answer = charShifter("MynamEISc", 3);
    System.out.println(answer);
  }
}
