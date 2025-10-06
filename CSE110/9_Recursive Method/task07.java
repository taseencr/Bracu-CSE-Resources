//"hi" counter
public class task07{
    public static int countHi(String str, int index){
        if(index>str.length()-2) return 0;

        if(str.charAt(index)=='h' && str.charAt(index+1)=='i'){
            return 1+countHi(str, index+1);
        }
        else{
          return countHi(str, index+1);
        }
    }

    public static void main(String[] args){
        System.out.println(countHi("xxhixx", 0));
        System.out.println(countHi("xhixhix", 0));
        System.out.println(countHi("hi", 0));
    }
}