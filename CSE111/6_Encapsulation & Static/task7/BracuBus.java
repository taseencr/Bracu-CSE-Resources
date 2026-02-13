public class BracuBus{
  String route;
  BracuStudent std[];
  int max;
  int count;
  
  public BracuBus(String route, int max){
    this.route = route;
    this.max = max;
    std = new BracuStudent[max];
  }
  public BracuBus(String route){
    this(route, 2);
  }
  
  public void showDetails(){
    System.out.println("Bus Route: " + route);
    System.out.println("Passenger Count: " + count + " (Max: " + max + ")");
    System.out.println("Passenger on Board: ");
    for(int i=0; i<count; i++){
      System.out.print(std[i].name + " ");
    }
    if(count!=0) System.out.println();
  }
  
  public void board(){
    System.out.println("No passengers");
  }
  public void board(BracuStudent s1){
    if(count<max){
      if(s1.hasPass){
        if(s1.getLoc().equals(route)){
          std[count] = s1;
          count++;
          System.out.println(s1.name + " boarded the bus.");
        }
        else System.out.println("You got on the wrong bus!");
      }
      else System.out.println("You don't have a bus pass!");
    }
    else System.out.println("Bus is full!");
  }
  public void board(BracuStudent s1, BracuStudent s2){
    board(s1);
    board(s2);
  }
}
