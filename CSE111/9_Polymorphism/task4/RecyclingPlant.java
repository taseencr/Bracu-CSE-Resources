public class RecyclingPlant {
 public static void main(String[] args) {
  SorterBot robot = new SorterBot();
  UsedBattery bat1 = new UsedBattery("Duracell-X", true);
  PlasticBottle bot1 = new PlasticBottle("Coke-Zero", 500);
  Waste unknown = new Waste("Mystery-Box");
  System.out.println("#######################");
  robot.processItem(bat1);
  robot.processItem(bot1);
  robot.processItem(unknown);
  robot.processItem(new UsedBattery("Energizer", false));
 }
}
