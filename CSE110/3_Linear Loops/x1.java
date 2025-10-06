//Build number from digits and check if digits form a non-decreasing pattern
import java.util.Scanner;

public class labq2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of n: ");
    int n = sc.nextInt();
    int num = 0;
    int power = 0;

    //Number construction using digit inputs
    for (int i = 1; i <= n; ) {
      int digit;

      //loop to validate if the digits are in range
      System.out.print("Enter digit " + i + ": ");
      digit = sc.nextInt();
      if (digit >= 0 && digit <= 9) {
        num += digit * (int)(Math.pow(10, power)); // constructing in reverse order
        power++;
        i++;
      } else {
        System.out.println("Please enter a digit between 0 and 9.");
      }
    }

    System.out.println("Constructed number: " + num);

    //Pattern checker (Using the digit extracting concept, yes ik it's frustrating to take digits and then construct the number and then again break the number into digits :)) But it is wut it is!)
    int count = 0;
    int prevDigit = num % 10;
    int temp = num / 10;

    while (temp > 0) {
      int curDigit = temp % 10;
      if (curDigit > prevDigit) {
        count++;
      }
      prevDigit = curDigit;
      temp = temp / 10;
    }

    int broken = (n - 1) - count; //*Important and a bit tricky concept*

    if (broken == 0) {
      System.out.println("Pattern check: Valid Pattern");
    } else {
      System.out.println("Pattern check: Invalid Pattern");
      System.out.println("Pattern Not Broken: " + count + " times");
    }
  }
}
