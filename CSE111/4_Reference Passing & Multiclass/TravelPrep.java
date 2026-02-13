public class TravelPrep{
  String name = "Unknown package";
  int cost = 1250;
  TravelPrep pack[] = new TravelPrep[3];
  int count;
  String t_name;
  
  public TravelPrep(){
    System.out.println(name + " would cost at most " + cost + " yen");
  }
  public TravelPrep(String name, int cost){
    this.name = name;
    this.cost = cost;
    System.out.println(name + " would cost at most " + cost + " yen");
  }
  
  public TravelPrep(String n1, String n2){
    name = n1 + " " + n2;
    cost = 300;
    System.out.println(name + " costs " + cost + " yen");
  }
  public TravelPrep(String n1, String n2, int cost){
    name = n2 + " " + n1;
    this.cost = cost;
    System.out.println(name + " costs " + cost + " yen");
  }
  
  public void add_to_itinerary(TravelPrep obj){
    if(cost>=obj.cost){
      pack[count] = obj;
      cost -= obj.cost;
      count++;
    }
    else System.out.println("Budget going overboard");
  }
  public void add_to_itinerary(TravelPrep obj1, TravelPrep obj2){
    add_to_itinerary(obj1);
    add_to_itinerary(obj2);
  }
  
  public void show_itinerary(){
    int total = 0;
    if(name.equals("Unknown package")) System.out.println("Itinerary for " + t_name);
    else System.out.println("Itinerary for " + name);
    for(int i=0; i<count; i++){
      System.out.println((i+1) + ". " + pack[i].name + " - " + pack[i].cost + " yen");
      total += pack[i].cost;
    }
    System.out.println("Total cost of " + count + " destinations: " + total + " yen");
  }
  
  public String updateCost(int cost){
    this.cost += cost;
    return "Cost of " + name + " updated to " + this.cost;
  }
}
