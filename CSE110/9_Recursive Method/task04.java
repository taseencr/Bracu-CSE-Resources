//Basics-3
public class task04{
  public static void oneToN(int a, int n){ //1
    if(a>n){
      return;
    }
    else{
      System.out.print(a + " ");
      oneToN(a+1, n);
    }
  }
  
  public static void nToOne(int a, int n){ //2
    if(n<a){
      return;
    }
    else{
      System.out.print(n + " ");
      nToOne(a, n-1);
    }
  }
  
  public static int recursiveSum(int a, int n){ //3
    if(a>n){
      return 0;
    }
    return a+recursiveSum(a+1, n);
  }
  
  
  public static void main(String[] args){
    oneToN(1,5);
    System.out.println();
    
    nToOne(1,5);
    System.out.println();
    
    System.out.println(recursiveSum(1,5));
  }
}
