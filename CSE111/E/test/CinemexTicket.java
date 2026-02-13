public class CinemexTicket extends MovieTicket{
  static int count;
  String genre;
  String id;
  boolean isPaid;
  
  public CinemexTicket(String movie, String showtime, String genre, String date, String seat){
    super(movie, date, showtime, 0);
    this.genre = genre;
    super.seat = seat;
    if(seat.equals("Regular")) id = movie + "-R-" + count;
    else if(seat.equals("Premium")) id = movie + "-P-" + count;
    else if(seat.equals("IMAX 3D")) id = movie + "-i-" + count;
    count++;
  }
  public CinemexTicket(String movie, String showtime, String genre, String date){
    this(movie, showtime, genre, date, "Regular");
  }
  
  public void calculateTicketPrice(){
    String[] time = showtime.split(":");
    int hrs = Integer.parseInt(time[0]);
    int idx = -1;
    for(int i=0; i<3; i++){
      if(seatTypes[i].equals(seat)) idx = i;
    }
    if(hrs>=18 && hrs<=23) setPrice(seatPrices[idx] + seatPrices[idx]*0.15);
    else setPrice(seatPrices[idx]);
    System.out.println("Ticket price is calculated successfully.");
  }
  
  public String confirmPayment(){
    String s = "";
    if(isPaid) s = "Ticket price is already paid!";
    else{
      isPaid = true;
      s = "Payment Successful.";
    }
    return s;
  }
  
  public static int getTotalTickets(){
    return count;
  }
  
  public String toString(){
    String s = "Ticket ID: " + id + "\n" + super.toString();
    s += "\nGenre: " + genre + "\nSeat Type: " + seat + "\nPrice(tk): " + getPrice();
    if(isPaid) s += "\nStatus: Paid";
    else s += "\nStatus: Not Paid";
    return s;
  }
}
