public class Reader{
  String name = "New user";
  int cap;
  int count;
  String[] books;
   
  public Reader(String name){
    this.name = name;
    this.cap = 2;
    books = new String[cap];
    System.out.println("A new reader is created!");
  }
  
  public Reader(String name, int cap){
    this.name = name;
    this.cap = cap;
    books = new String[cap];
    System.out.println("A new reader is created!");
  }
  
  public void readerInfo(){
    System.out.println("Name: " + name);
    System.out.println("Capacity: " + cap);
    System.out.println("Books: ");
    if(count==0) System.out.println("No books added yet");
    else{
      for(int i=0; i<count; i++){
        System.out.println("Book " + (i+1) + ": " + books[i]);
      }
    }
  }
  
  public void addBook(String name){
    if(count<cap){
      books[count] = name;
      count++;
    }
    else System.out.println("No more capacity");
  }
  
  public void updateCapacity(int cap){
    String[] temp = new String[cap];
    for(int i=0; i<this.cap; i++){
      temp[i] = books[i];
    }
    books = temp;
    this.cap = cap;
    System.out.println("Capacity has changed to " + cap);
  }
}
