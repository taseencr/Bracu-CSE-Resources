public class KKFlavouredTea extends KKTea{
  String flavour;
  
  public KKFlavouredTea(String flavour, int price, int tb){
    super(price, tb);
    super.name = "KK " + flavour + " Tea";
  }
  
  public static void updateSoldStatusFlavoured(KKFlavouredTea obj){
    obj.status = true;
    tcount++;
    fcount++;
  }
}
