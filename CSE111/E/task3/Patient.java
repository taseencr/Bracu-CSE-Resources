public class Patient{
  static int count;
  String id;
  String name;
  String doctor;
  
  public Patient(String name, String doctor){
    this.name = name;
    this.doctor = doctor;
    count++;
    id = "P0" + count;
  }
  
  public String toString(){
    return "Patient ID: " + id + ", Name: " + name + "\nDoctor: " + doctor;
  }
  
  public static void details(){
    System.out.println("Total patients: " + count);
  }
  public static void details(Patient[] obj){
    System.out.println("Details of " + obj.length + " selected patients: ");
    for(int i=0; i<obj.length; i++){
      System.out.println("== == == == ==");
      System.out.println(obj[i]);
    }
  }
}
