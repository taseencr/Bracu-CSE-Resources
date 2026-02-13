public class SmartHomeTester {
 public static void main(String[] args) {
  SmartSecurityCamera cam1 = new SmartSecurityCamera("Garden-Cam", 100, 64);
  cam1.powerOn();
  System.out.println("=====================");
  cam1.record(true);
  System.out.println("=====================");
  cam1.powerOff();
  System.out.println("=====================");
  cam1.powerOn();
  System.out.println("=====================");
  cam1.record();
  System.out.println("=====================");
  cam1.formatCard("0000");
  System.out.println("=====================");
  cam1.formatCard("ADMIN123");
  System.out.println("=====================");
  SmartSecurityCamera cam2 = new SmartSecurityCamera("Indoor-Cam", 80, 1);
  cam2.powerOn();
  System.out.println("=====================");
  cam2.record();
  System.out.println("=====================");
  cam2.powerOff();
  System.out.println("=====================");
  cam2.powerOn();
  System.out.println("=====================");
  cam2.formatCard("ADMIN123");
  System.out.println("=====================");
  cam2 = new SmartSecurityCamera("Indoor-Cam", 2, 10);
  cam2.powerOn();
 }
}
