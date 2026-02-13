public class Event{
  private String name;
  String date;
  static Event events[] = new Event[5];
  static int count;
  
  public String getname(){
    return name;
  }
  
  public Event(String name, String date){
    if(count<5){
      this.name = name;
      this.date = date;
      events[count] = this;
      count++;
    }
  }
  
  public String details(){
    return "Name: " + name + "\nDate: " + date;
  }
  
  public static void allEventInfo(){
    System.out.println("Total Events: " + count);
    System.out.println("Event Details: ");
    for(int i=0; i<count; i++){
      System.out.println("Event " + (i+1) + ": ");
      System.out.println(events[i].details());
    }
  }
}
