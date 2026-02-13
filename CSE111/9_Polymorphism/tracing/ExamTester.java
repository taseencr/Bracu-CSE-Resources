public class ExamTester{
  public static void main(String[] args) {
    Exam x = new Exam();
    Exam4 y = new Exam4();
    x.methodX(y, 3);
  }
}



class Exam{
 public static int temp = 4;
 public static boolean flag;
 public int x, y = 2;
 public int sum = 3;
 public Exam() {
 y = x + 2;
 sum = (temp)%2;
 }
 public int methodX(Exam m, int n) {
 int y = 1;
 x = this.y + m.x * (temp++);
 sum += m.sum - y + 2*n;
 System.out.println(x + " " + y + " " + sum);
 if (flag==false) {
 flag = true;
 Exam4 b = new Exam4(this);
 }
 return sum;
 }
}

class Exam4 extends Exam {
 public static int x = -12;
 public int sum = 8;
 public Exam4() {
 x = -6;
 y = x/temp;
 super.sum = (temp)+2;
 }
 public Exam4(Exam a) {
 x = a.sum + super.x;
 this.methodY(x+2, y*3);
 sum = a.sum + super.sum;
 }
 public void methodY(int m, int n) {
 int x = 2;
 y = m + (++temp);
 int s = methodX(this, x);
 sum = x + s - n;
 System.out.println(x + " " + y + " " + sum);
 }
 }
