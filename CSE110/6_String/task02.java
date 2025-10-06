//Palindrome checker
import java.util.Scanner;

public class task02{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String text = sc.nextLine();
    String reverse = "";
    
    for(int i=text.length()-1; i>=0; i--){
      reverse = reverse + text.charAt(i);
    }
    
    System.out.println(text.equals(reverse));
  }
}
