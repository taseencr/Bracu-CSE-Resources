//Common string finder
import java.util.Scanner;

public class task09{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    String pass = sc.nextLine();
    boolean found = false;
    
    for(int i=0; i<=pass.length()-name.length(); i++){
      int j;
      for(j=0; j<name.length(); j++){
        if(pass.charAt(i+j)!=name.charAt(j)){
          break;
        }
      }
      if(j==name.length()){
        found = true;
      }
    }
    
    if(found) System.out.println("Invalid");
    else System.out.println("Valid");
  }
}
