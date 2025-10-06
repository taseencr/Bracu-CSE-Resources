//Checker: 1-Prime, 2-Perfect, 3-Special
import java.util.Scanner;

public class task01{
  public static boolean isPrime(int num){ //1
    if(num<=1){
      return false;
    }
    for(int i=2; i<num; i++){
      if(num%i==0){
        return false;
      }
    }
    return true;
  }
  
  public static boolean isPerfect(int num){ //2
    int sum = 0;
    if(num<=1){
      return false;
    }
    for(int i=1; i<num; i++){
      if(num%i==0){
        sum += i;
      }
    }
    return sum==num;
  }
  
  public static int special_sum(int num){ //3
    int sum = 0;
    for(int i=2; i<=num; i++){
      if(isPrime(i) || isPerfect(i)){
        sum += i;
      }
    }
    return sum;
  }
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    
    boolean check1 = isPrime(num);
    System.out.println(check1);
    
    boolean check2 = isPerfect(num);
    System.out.println(check2);
    
    int result = special_sum(num);
    System.out.println(result);
  }
}
