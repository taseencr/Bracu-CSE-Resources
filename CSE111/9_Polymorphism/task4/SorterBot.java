class SorterBot {
  public void processItem(Waste item){
    if(item instanceof UsedBattery){
      UsedBattery b = (UsedBattery)item;
      System.out.println("Scanning Item " + b.id + " [Type: BATTERY]");
      if(b.isLeaking) System.out.println(b.id + " is leaking. Sealing in concrete container.");
      else System.out.println("Energizer stored in dry cell.");
    }
    else if(item instanceof PlasticBottle){
      PlasticBottle b = (PlasticBottle)item;
      System.out.println("Scanning Item " + b.id + " [Type: PLASTIC]");
      System.out.println(b.id + " compressed from " + b.ml + "ml to flat disk");
    }
    else{
      System.out.println("Scanning Item Mystery-Box [Type: UNKNOWN]\nItem sent to generic incinerator.");
    }
    System.out.println("-------------------------------");
  }
}
