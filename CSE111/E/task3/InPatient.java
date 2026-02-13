public class InPatient extends Patient{
  static int inpcount;
  String dept;
  
  public InPatient(String name, String doctor, String dept){
    super(name, doctor);
    super.name = name;
    super.doctor = doctor;
    this.dept = dept;
    inpcount++;
    System.out.println("New patient admitted in " + dept + ".");
  }
  
  public String toString(){
    String s = super.toString();
    s += "\nDepartment: " + dept;
    return s;
  }
  
  public static void details(){
    System.out.println("Total patients: " + count);
    System.out.println("Admitted In-Patients: " + inpcount);
    System.out.println("Out-Patients: " + (count-inpcount));
  }
}
