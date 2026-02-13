public class Tester{
  public static void main(String[] args){
    int[] n = {23};
    A a1 = new A(3);
    B b1 = new B();
    B b2 = new B(b1);
    a1.methodA(1, n);
    b2.methodB(3, 2);
    a1.methodA(1, n);
  }
}

class A {
 public static int temp = 3;
 public int sum;
 public int y;
 public A(int x) {
   y = A.temp - 1 + x;
   sum = this.temp + 2;
   A.temp -= 2;
 }
 public void methodA(int y, int[] n) {
   int x = 0;
   n[0] += 1;
   this.y = this.y + y + temp;
   A.temp += 1;
   x = x + 2 + n[0];
   n[0] = sum + 2;
   System.out.println(x + " " + this.y + " " + this.sum);
 }
}
class B extends A {
  public static int x = 1;
  public B() {
    super(5);
    sum = 2;
    y = A.temp + 1;
    B.x = 3 + temp + B.x;
    A.temp -= 2;
  }
  public B(B b) {
    super(2);
    sum = 3;
    this.sum = sum + this.sum%2 + 2;
    B.x = b.x + B.x;
  }
  public void methodB(int m, int n) {
    int[] y = {2, 3};
    this.y = y[0] + this.y + m;
    B.x = this.y + 2 + A.temp - n;
    methodA(B.x, y);
    this.sum = B.x + y[1] + this.sum;
    System.out.println(B.x + " " + (y[0]+y[1]) + " " + this.sum);
  }
}

