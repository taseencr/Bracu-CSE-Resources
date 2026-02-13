public class DesktopTester {
  public static void main(String[] args) {
    
    System.out.println(Desktop.details());
    
    Desktop d1 = new Desktop();
    System.out.println("1====================");
    d1.addFeature("Display", "21.5 inch");
    
    System.out.println("2====================");
    d1.updateName("Intel PC");
    d1.addFeature("Display", "21.5 inch");
    d1.printDetail();
    
    System.out.println("3====================");
    Desktop d2 = new Desktop("Ryzen PC");
    d2.addFeature("Display", "27.0 inch");
    d2.addFeature("Ram", "16 GB");
    
    System.out.println("4====================");
    d2.printDetail();
    
    d2.addFeature("Display", "2160p");
    d2.addFeature("Ram", "DDR5");
    
    System.out.println("5====================");
    d2.printDetail();
    
    System.out.println("6====================");
    System.out.println(Desktop.details());
  }
}
