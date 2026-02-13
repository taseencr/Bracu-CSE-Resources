public class ConcertTester{
  public static void main(String[] args) {    
    Concert concert = new Concert("ABC Conference Center","7:00 PM");   
    concert.showDetails();
    System.out.println("--------1--------");   
    concert.addArtist("Tahsan Khan");
    concert.addArtist("Habib Wahid");   
    concert.showDetails();
    System.out.println("--------2--------");   
    Audience a1 = new Audience("Sarah");
    Audience a2 = new Audience("Alex");
    System.out.println("--------3--------");
    a1.buyConcertTicket(concert, "A", 3);    
    a2.buyConcertTicket(concert, "B");  
    System.out.println("--------4--------");
    concert.showDetails();
    System.out.println("--------5--------");
    VIPConcert vipConcert = new VIPConcert("Army Stadium","10:00 PM");
    vipConcert.addArtist("Atif Aslam");    
    Audience a3 = new Audience("Emily");
    a3.buyConcertTicket(vipConcert); 
    System.out.println("--------6--------");
    vipConcert.showDetails();
    System.out.println("--------7--------");;
    Concert.showTotalTicketsSold();
  }
}
