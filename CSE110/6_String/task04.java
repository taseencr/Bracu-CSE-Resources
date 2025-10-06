//Treasure using v c
import java.util.Scanner;

public class task04{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String phrase = sc.nextLine();
    String text = phrase.toLowerCase();
    int vcount = 0;
    int ccount = 0;
    
    for(int i=0; i<text.length(); i++){
      char ch = text.charAt(i);
      if(ch>='a' && ch<='z'){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
        vcount++;
        }
        else ccount++;
      }
    }
    
    if(vcount%3==0 && vcount>0 && ccount>0 && ccount%5==0){
      System.out.println("Aaarr! Me Plunder!!");
    }
    else System.out.println("Blimey! No Plunder!!");
  }
}
