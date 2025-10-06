//Pass strength checker
import java.util.Scanner;

public class task08{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String text = sc.nextLine();
    String result = "";
    boolean hasUpperCase=false, hasLowerCase=false, hasDigits=false, hasSpecialChar=false;
    
    for(int i=0; i<text.length(); i++){
      char ch = text.charAt(i);
      if(Character.isUpperCase(ch)) hasUpperCase=true;
      else if(Character.isLowerCase(ch)) hasLowerCase=true;
      else if(Character.isDigit(ch)) hasDigits=true;
      else if(!Character.isWhitespace(ch)) hasSpecialChar=true;
    }
    
    if(hasUpperCase && hasLowerCase && hasDigits && hasSpecialChar){
      System.out.println("True");
    }
    else System.out.println("False");
  }
}
