public class CinemexTicket extends MovieTicket{
  static int count;
  String id;
  String genre;
  boolean status = false;

  public CinemexTicket(String movie, String time, String genre, String date, String seat){
    super(movie, date, time, 0);
    super.seat = seat;
    this.genre = genre;
    if(seat.equals("Regular")) id = movie + "-R-" + (count+1);
    else if(seat.equals("Premium")) id = movie + "-P-" + (count+1);
    else if(seat.equals("IMAX 3D")) id = movie + "-I-" + (count+1);
    count++;
  }
  public CinemexTicket(String movie, String time, String genre, String date){
    this(movie, time, genre, date, "Regular");
  }
  
  public static int getTotalTickets(){
    return count;
  }
  
  public void calculateTicketPrice(){
    String time[] = showtime.split(":");
    int hrs = Integer.parseInt(time[0]);
    int idx = -1;
    for(int i=0; i<3; i++){
      if(seatTypes[i].equals(seat)) idx = i;
    }
    if(hrs>=18 && hrs<=23){
      setPrice(seatPrices[idx]+seatPrices[idx]*0.15);
    }
    else setPrice(seatPrices[idx]);
    System.out.println("Ticket price is calculated successfully.");
  }
  
  public String confirmPayment(){
    if(status) return "Ticket price is already paid!";
    else{
      status = true;
      return "Payment Successful.";
    }
  }
  
  public String toString(){
    String temp = "Ticket ID: " + id + "\n" + super.toString();
    temp += "\nGenre: " + genre + "\nSeat Type: " + seat + "\nPrice(tk): " + getPrice() + "\nStatus: ";
    if(status) temp += "Paid";
    else temp += "Not Paid";
    return temp;
  }
}
