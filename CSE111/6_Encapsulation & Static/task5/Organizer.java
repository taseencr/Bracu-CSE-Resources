public class Organizer{
  String name;
  int ecount;
  Event events[] = new Event[4];
  static Organizer orgs[] = new Organizer[2];
  static int ocount;
  
  public Organizer(){
    System.out.println("Please provide the organizer's name");
  }
  public Organizer(String name){
    if(ocount<2){
      this.name = name;
      orgs[ocount] = this;
      ocount++;
    }
  }
  
  public void organizeEvent(Event event){
    if(ecount<4){
      events[ecount] = event;
      ecount++;
      System.out.println(name + " successfully organized " + event.getname());
    }
  }
  
  public void searchEventByDate(String date){
    int idx = -1;
    for(int i=0; i<ecount; i++){
      if(events[i].date.equals(date)){
        System.out.println(events[i].getname());
        idx = i;
      }
    }
    if(idx==-1) System.out.println("No event is scheduled for " + date);
  }
}
