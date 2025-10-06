//Equation simplifier
public class x06{
  public static void main(String[] args){
    String exp = "100x-13y-7x+22x-13y+113y";
    int xCoeff = 0;
    int yCoeff = 0;
    int cur = 0;
    int sign = 1;
    boolean readingNum = false;
    String result = "";
    
    for(int i=0; i<exp.length(); i++){
      char ch = exp.charAt(i);
      
      if(ch=='+'){
        sign = 1;
      }
      else if(ch=='-'){
        sign = -1;
      }
      
      else if(ch>='0' && ch<='9'){
        cur = cur*10 + (ch-'0');
        readingNum = true;
      }
      
      else if(ch=='x' || ch=='y'){
        if(!readingNum){
          cur = 1;
        }
        if(ch=='x'){
          xCoeff += sign*cur;
        }
        else yCoeff += sign*cur;
        
        cur = 0;
        readingNum = false;
      }
    }
    
    if(xCoeff!=0){
      result += xCoeff + "x";
    }
    if(yCoeff!=0){
      if(yCoeff>0) result += "+" + yCoeff + "y";
      else result += yCoeff + "y";
    }
    
    System.out.println(result);
  }
}
