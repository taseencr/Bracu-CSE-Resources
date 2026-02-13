public class TestLibrary{
  public static void main(String[] args) {
    Library library = new Library("The Mind Maze");
    library.showRoomInfo();
    System.out.println("======== 1 ========");
    StudyRoom room9 = new StudyRoom("Study Hub");
    SilentStudyRoom room9A  = new SilentStudyRoom("Focus Room");
    room9.addBook("Data Structures");
    System.out.println("======== 2 ========");
    room9.addBook("Operating Systems");
    room9.showRoomInfo();
    System.out.println("======== 3 ========");
    System.out.println("Total books: " +StudyRoom.totalBooks);
    System.out.println("======== Add Book ========");
    room9A.addBook(library, room9);
    System.out.println("======== 4 ========");
    room9A.showRoomInfo();
    System.out.println("Total books: " +StudyRoom.totalBooks);
    System.out.println("======== Add Book Again ========");
    room9A.addBook(library, room9);
    System.out.println("======== 5 ========");
    room9A.showRoomInfo();
    System.out.println("Total books: " + StudyRoom.totalBooks);
  }
}
