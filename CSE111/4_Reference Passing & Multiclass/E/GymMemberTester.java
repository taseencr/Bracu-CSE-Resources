public class GymMemberTester {
  public static void main(String[] args) {
    Member m1 = new Member("Luffy", "Dressrosa");
    System.out.println("1===============");
    Member m2 = new Member("Zoro", "Wano");
    Member m3 = new Member("Jimbe", "Dressrosa");
    m1.showDetails();
    m2.showDetails();
    System.out.println("2===============");
    m3.showDetails();
    System.out.println("3===============");
    Gym g1 = new Gym("Dressrosa");
    Gym g2 = new Gym("Wano", 5);
    g1.showDetails();
    g2.showDetails();
    System.out.println("4===============");
    m2.activateMembership();
    m3.activateMembership();
    System.out.println("5===============");
    m2.showDetails();
    m3.showDetails();
    System.out.println("6===============");
    g1.checkIn();
    System.out.println("7===============");
    g1.checkIn(m1, m2);
    System.out.println("8===============");
    m1.activateMembership();
    m2.updateBranch("Dressrosa");
    m1.showDetails();
    m2.showDetails();
    System.out.println("9===============");
    g1.checkIn(m1);
    g1.checkIn(m2, m3);
    System.out.println("10===============");
    g1.showDetails();
  }
}

