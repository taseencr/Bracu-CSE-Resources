public class SultansDine{
  static int tsell;
  static int count;
  static SultansDine branch[] = new SultansDine[3];
  String name;
  int sell;
  
  public SultansDine(String name){
    this.name = name;
    branch[count] = this;
    count++;
  }
  
  public void sellQuantity(int sell){
    if(sell<10) this.sell = sell*300;
    else if(sell<20) this.sell = sell*350;
    else this.sell = sell*400;
    tsell += this.sell;
  }
  
  public void branchInformation(){
    System.out.println("Branch Name: " + name);
    System.out.println("Branch Sell: " + sell + " Taka");
  }
  
  public static void details(){
    System.out.println("Total Number of branch(s): " + count);
    System.out.println("Total sell: " + tsell + " Taka");
    for(int i=0; i<count; i++){
      System.out.println("Branch Name: " + branch[i].name + ", Branch Sell: " + branch[i].sell + " Taka");
      System.out.println("Branch consists of total sell's " + ((branch[i].sell*1.0/tsell)*100));
    }
  }
}
