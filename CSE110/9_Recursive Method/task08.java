//pi->"3.1416"
public class task08{
    public static String changePI(String str, int index){
        if (index >= str.length()) return "";
        if (index == str.length()-1) return "" + str.charAt(index);

        if(str.charAt(index)=='p' && str.charAt(index+1)=='i'){
            return "3.14" + changePI(str, index+2);
        }
        else{
          return str.charAt(index) + changePI(str, index+1);
        }
    }

    public static void main(String[] args){
        System.out.println(changePI("xpix", 0));
        System.out.println(changePI("pipi", 0));
        System.out.println(changePI("pip", 0));
    }
}
