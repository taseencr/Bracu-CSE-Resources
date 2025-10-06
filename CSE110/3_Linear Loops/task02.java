//Sum of numbers up to 600 divisible by 7 or 9 (but not both)
public class task2{
  public static void main(String[] args){
    int sum = 0;
    for(int i=0; i<=600; i++){
      if(i%7==0){
        if(i%9!=0){
          sum = sum+i;
        }
      }
      else if(i%9==0){
        sum = sum+i;
      }
    }
    System.out.println(sum);
  }
}
