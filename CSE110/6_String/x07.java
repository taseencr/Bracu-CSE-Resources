//Faulty keyboard: pizza,cOOkIe,PASTA-shawarma->Pizza,Cookie,Pasta,Shawarma
import java.util.Scanner;

public class x07{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your order: ");
    String txt = sc.nextLine();
    String result = "";
    boolean firstLetter = true;
    
    for(int i=0; i<txt.length(); i++){
      char ch = txt.charAt(i);
      
      if(ch==','){
        result += ch;
        firstLetter = true;
      }
      
      else if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')){
        if(firstLetter){
          if(ch>='a' && ch<='z') result += (char)(ch-32);
          else result += ch;
          firstLetter = false;
        }
        else{
          if(ch>='A' && ch<='Z') result += (char)(ch+32);
          else result += ch;
        }
      }
      
      else{
        firstLetter = true;
        result += ',';
      }
    }
    System.out.println(result);
  }
}
