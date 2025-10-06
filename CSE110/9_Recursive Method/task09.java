public class task09{
  public static String onlyabc(String str, int idx){
    if(idx>str.length()-3) return "";
    String res = "";
    
    if(str.charAt(idx)=='a' && str.charAt(idx+1)=='b' && str.charAt(idx+2)=='c'){
      return "abc" + onlyabc(str, idx+3);
    }
    else return onlyabc(str, idx+1);
  }
  
  public static void main(String[] args){
    String result = onlyabc("abcAurabcubabcbc", 0);
    System.out.println(result);
  }
}
