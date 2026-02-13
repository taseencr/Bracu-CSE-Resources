public class Book extends Product{
  String isbn;
  String publisher;
  
  public Book(int id, String title, int price, String isbn, String publisher){
    super(id, title, price);
    this.isbn = isbn;
    this.publisher = publisher;
  }
  
  public String printDetail(){
    System.out.println(getIdTitlePrice());
    return "ISBN: " + isbn + " Publisher: " + publisher;
  }
}
