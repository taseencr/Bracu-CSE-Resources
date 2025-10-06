//Extract the digits from two strings, calculate the sum of digits in each string
//Compare the sums, and print the higher digit sum
public class task08{
  public static int digitCalculator(String s1, String s2){
    int sum1 = sum(s1);
    int sum2 = sum(s2);
    if(sum1>sum2) return sum1;
    else return sum2;
  }
  
  public static int sum(String s){
    int total = 0;
    for(int i=0; i<s.length(); i++){
      char ch = s.charAt(i);
      if(ch>='0' && ch<='9'){
        total += ch-'0';
      }
    }
    return total;
  }
  
  public static void main(String[] args){
    int larger = digitCalculator("F4C5B3,4","R0M2A2_3");
    System.out.println(larger);
  }
}
