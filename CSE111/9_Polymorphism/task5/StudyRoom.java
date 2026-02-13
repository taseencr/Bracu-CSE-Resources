class StudyRoom extends Library{
  static int totalBooks;
  String book1;
  String book2;
  
  public StudyRoom(String name){
    super(name);
  }
  
  public String getBook1(){
    return book1;
  }
  public void setBook1(String b1){
    book1 = b1;
  }
  public String getBook2(){
    return book2;
  }
  public void setBook2(String b2){
    book2 = b2;
  }
  
  public void addBook(String book){
    if(book1!=null){
      if(book2!=null){
        System.out.println("Can't add more books");
      }
      else{
        book2 = book;
        totalBooks++;
      }
    }
    else{
      book1 = book;
      totalBooks++;
    }
  }
  
  public void showRoomInfo(){
    System.out.println(name + " Details: ");
    if(book1!=null)System.out.println("Book 1: " + book1);
    else System.out.println("No book added");
    if(book2!=null) System.out.println("Book 2: " + book2);
    else System.out.println("No book added");
  }
  
  public void removeBook(int i){
    if(i==1){
      book1 = null;
      totalBooks--;
      System.out.println("Book 1 Removed from " + name);
    }
    else if(i==2){
      book2 = null;
      totalBooks--;
      System.out.println("Book 2 Removed from " + name);
    }
  }
}
