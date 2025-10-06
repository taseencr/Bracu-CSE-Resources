public class t2{
  public static void main(String[] args){
    int[] arr = {2, 2, 1, 0, 1, 6, 2, 4};
    int count = 0;
    
    for(int i=1; i<arr.length-1; i++){
      int lsum = 0;
      int rsum = 0;
      for(int j=0; j<i; j++){
        lsum += arr[j];
      }
      for(int j=i+1; j<arr.length; j++){
        rsum += arr[j];
      }
      if(lsum==arr[i] && rsum==arr[i]){
        System.out.println(i);
        count ++;
      }
    }
    
    if(count==0) System.out.println("Not Applicable");
  }
}
