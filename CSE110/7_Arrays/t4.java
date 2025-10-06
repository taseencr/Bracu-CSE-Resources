//Binary->Decimal->Hexa
public class t4{
  public static int toDecimal(String binary){
    int decimal = 0;
    for(int i=0; i<binary.length(); i++){
      char bit = binary.charAt(i);
      decimal = decimal*2 + (bit-'0');
    }
    return decimal;
  }
  
  public static String toHex(int decimal){
    if(decimal==0) return "0";
    String hex = "";
    
    while(decimal>0){
      int remainder = decimal%16;
      char hexChar;
      if(remainder<10) hexChar = (char) ('0' + remainder);
      else hexChar = (char) ('A'+(remainder-10));
      
      hex = hexChar + hex;
      decimal /= 16;
    }
    return hex;
  }
  
  public static void main(String[] args){
    int decimal = toDecimal("1010");
    String hex = toHex(decimal);
    System.out.println(hex);
  }
}
