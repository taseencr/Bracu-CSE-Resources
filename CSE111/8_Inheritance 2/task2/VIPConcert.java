public class VIPConcert extends Concert{
  public VIPConcert(String venue, String time){
    super(venue, time);
  }
  
  public void buyTicket(){
    System.out.println("Total price: 2000");
    tickets++;
    tcount++;
  }
}
