public class KKTea extends Tea{
  static int tcount;
  static int rcount;
  static int fcount;
  int teaBags;
  
  public KKTea(int price, int tb){
    super("KK Regular Tea", price);
    this.teaBags = tb;
  }
  
  public void productDetail(){
    super.productDetail();
    System.out.println("Weight: " + (teaBags*2) + ", Tea Bags: " + teaBags);
  }
  
  public static void totalSales(){
    System.out.println("Total Sales: " + tcount);
    System.out.println("KK Regular Tea: " + rcount);
    if(fcount>0) System.out.println("KK Flavoured Tea: " + fcount);
  }
  
  public static void updateSoldStatusRegular(KKTea obj){
    obj.status = true;
    tcount++;
    rcount++;
  }
}
