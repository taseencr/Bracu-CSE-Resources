public class CD extends Product{
  String band;
  int duration;
  String genre;
  
  public CD(int id, String title, int price, String band, int duration, String genre){
    super(id, title, price);
    this.band = band;
    this.duration = duration;
    this.genre = genre;
  }
  
  public String printDetail(){
    System.out.println(getIdTitlePrice());
    return "Band: " + band + " Duration: " + duration + " minutes Genre: " + genre;
  }
}
