//Most frequent bigram
import java.util.Scanner;

public class x03{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String text = sc.nextLine();
    
    if(text.length()<2){
      System.out.println("Not enough characters to form bigrams");
    }
    else{
      String bi = "";
      int max = 0;
      
      for(int i=0; i<text.length()-1; i++){
        String current = "" + text.charAt(i) + text.charAt(i+1);
        int count = 0;
        
        for(int j=i; j<text.length()-1; j++){
          String temp = "" + text.charAt(j) + text.charAt(j+1);
          if(temp.equals(current)){
            count++;
          }
        }
        
        if(count>max){
          bi = current;
          max = count;
        }
      }
      System.out.println("Most frequent bigram: " + bi + " (" + max + " times)");
    }
  }
}
