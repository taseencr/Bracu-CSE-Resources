public class NikeBD{
  static NikeBD branches[] = new NikeBD[5];
  static int bcount;
  String outlet;
  String[] products = {"Jordan", "Cortez", "Kobe"};
  int[] inv = new int[3];
  int sold;
  
  public NikeBD(String outlet){
    this.outlet = outlet;
    branches[bcount] = this;
    bcount++;
  }
  
  public void details(){
    System.out.println("Nike " + outlet + " outlet: ");
    System.out.println("Products Currently Stocked: Jordan: " + inv[0] + ", Cortez: " + inv[1] + ", Kobe: " + inv[2]);
    System.out.println("Sold: " + sold);
  }
  
  public static void status(){
    System.out.println("Nike Bangladesh Status: ");
    System.out.println("Branches Opened: " + bcount);
    int jordanCount = 0;
    int cortezCount = 0;
    int kobeCount = 0;
    int tSold = 0;
    for(int i=0; i<bcount; i++){
      jordanCount += branches[i].inv[0];
      cortezCount += branches[i].inv[1];
      kobeCount += branches[i].inv[2];
      tSold += branches[i].sold;
    }
    System.out.println("Currently Stocked: Jordan: " + jordanCount + ", Cortez: " + cortezCount + ", Kobe: " + kobeCount);
    System.out.println("Sold: " + tSold);
  }
  
  public void restockProducts(String[] prd, int[] qty){
    for(int i=0; i<prd.length; i++){
      inv[i] += qty[i];
    }
  }
  public void restockProducts(String prd, int qty){
    for(int i=0; i<3; i++){
      if(products[i].equals(prd)) inv[i] += qty;
    }
  }
  
  public void productSold(String prd1, int sell1, String prd2, int sell2){
    sold += sell1 + sell2;
    for(int i=0; i<3; i++){
      if(products[i].equals(prd1)) inv[i] -= sell1;
    }
    for(int i=0; i<3; i++){
      if(products[i].equals(prd2)) inv[i] -= sell2;
    }
  }
}
