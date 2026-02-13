public class PatientTester {
 public static void main(String[] args) {
  Patient p1 = new Patient("Robert", "Dr. Thomas");
  System.out.println(p1);
  System.out.println("1.................");
  Patient.details();
  System.out.println("2.................");
  InPatient p2 = new InPatient("Christina", "Dr. Alex", "Oncology");
  System.out.println(p2);
  System.out.println("3.................");
  InPatient.details();
  System.out.println("4.................");
  Patient p3 = new InPatient("Sofia", "Dr. Brawn", "Pediatrics");
  Patient p4 = new Patient("Patrick", "Dr. Alex");
  Patient.details();
  System.out.println("5.................");
  Patient[] allPatients = { p1, p2, p3, p4 };
  Patient.details(allPatients);
 }
}
