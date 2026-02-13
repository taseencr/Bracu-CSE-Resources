public class Concert{
  static int tcount;
  String venue;
  String time;
  int tickets;
  String artists[] = new String[5];
  int count;
  
  public Concert(String venue, String time){
    this.venue = venue;
    this.time = time;
  }
  
  public void showDetails(){
    System.out.println("Venue: " + venue);
    System.out.println("Showtime: " + time);
    System.out.println("Artist:");
    for(int i=0; i<count; i++){
      System.out.println("-" + artists[i]);
    }
    System.out.println("Tickets sold in this concert: " + tickets);
  }
  
  public void addArtist(String artist){
    if(count<5){
      artists[count] = artist;
      count++;
    }
  }
  
  public void buyTicket(String zone, int quantity){
    int price = 0;
    if(zone.equals("A")) price = quantity*500;
    else if(zone.equals("B")) price = quantity*1000;
    System.out.println("Total price: " + price);
    tickets += quantity;
    tcount += quantity;
  }
  public void buyTicket(String zone){
    buyTicket(zone, 1);
  }
  
  public static void showTotalTicketsSold(){
    System.out.println("Total tickets sold (all venues): " + tcount);
  }
}
