public class Quiz{
  public static void main(String[] args){
    Tutorial obj1 = new Tutorial();
    Course obj2 = new Seminar();
    Object obj3 = new Tutorial();
    Course obj4 = new Lab();
    Object obj5 = new Lecture();
    
//    obj1.attend();
//    obj5.attend();
//    System.out.println(obj2.schedule);
//    ((Lecture)obj2).attend();
//    ((Course)obj1).attend();
//    ((Tutorial)obj3).start();
//    ((Course)obj4).start();
//    System.out.println(((Seminar)obj5).schedule);
//    System.out.println((Course)obj2);
//    System.out.println(((Lecture)obj3));
  }
}














class Tutorial extends Course {
 String schedule = "daily";
 public void attend() {
   System.out.println(this + " " + schedule);
 }
}
class Lecture extends Course {
 public void attend() {
   System.out.println("Attending the lecture");
   System.out.println((Lecture)this);
   this.start();
 }
 public void start() {
   System.out.println(super.toString()+" "+schedule);
 }
 public String toString() {
   return "Listening to a lecture";
 }
}
class Seminar extends Lecture {
 String schedule = "morning";
 public void attend() {
   super.attend();
   System.out.println(schedule+ " "+super.schedule);
 }
 public void start() {
   System.out.println(super.toString()+" "+schedule);
 }
}
class Course {
 String schedule = "weekly";
 public void start() {
   if (this instanceof Course) {
     System.out.println("Course is starting");
     System.out.println(schedule);
   } else if (this instanceof Tutorial) {
     System.out.println(this);
     System.out.println(((Tutorial)this).schedule);
   }
 }
 public String toString() {
   return "Studying the course";
 }
}
class Lab extends Lecture {
 public void start() {
   System.out.println(super.toString()+" "+schedule);
 }
}