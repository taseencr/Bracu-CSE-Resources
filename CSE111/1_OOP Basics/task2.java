import java.util.Scanner;

public class task2{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String txt = sc.nextLine();
    String result = "";
    
    for(int i=0; i<txt.length(); i++){
      char ch = txt.charAt(i);
      if(ch=='a') result += 'z';
      else result += (char)(ch-1);
    }
    System.out.println(result);
  }
}