class SilentStudyRoom extends StudyRoom{
  public SilentStudyRoom(String name) {
    super(name);
  }
  
  public void addBook(Library lib, StudyRoom room) {
    lib.showRoomInfo(); 
    if (room.getBook1() != null) {
      System.out.println("Adding book: " + room.getBook1());
      this.setBook1(room.getBook1());
      room.removeBook(1);
      System.out.println("Book added successfully!");
    }
    else if (room.getBook2() != null) {
      System.out.println("Adding book: " + room.getBook2());
      this.setBook2(room.getBook2());
      room.removeBook(2);
      System.out.println("Book added successfully!");
    }
    else {
      System.out.println("No books available in "+room.name);
    }
  }
}
