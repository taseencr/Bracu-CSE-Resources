//Print last two digits of a number in reverse order
public class task3{
  public static void main(String[] args){
    int stid = 23221454;
    int lastTwoDigits = 23221454 % 100;
    int rightMost = lastTwoDigits % 10;
    int secondRightMost = lastTwoDigits / 10;
    System.out.println("" + rightMost + secondRightMost);
  }
}
