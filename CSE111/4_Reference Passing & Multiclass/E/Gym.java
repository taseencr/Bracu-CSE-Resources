public class Gym{
  String branch;
  int cap = 2;
  int count;
  Member mem[];
  
  public Gym(String branch){
    this.branch = branch;
    mem = new Member[cap];
  }
  public Gym(String branch, int cap){
    this.branch = branch;
    this.cap = cap;
    mem = new Member[cap];
  }
  
  public void showDetails(){
    System.out.println("Gym Branch: " + branch);
    System.out.println("Members Checked In: " + count + " (Max: " + cap + ")");
    if(count==0) System.out.println("No members inside");
    else{
      System.out.println("Members Inside: ");
      for(int i=0; i<count; i++){
        System.out.println("-----------");
        mem[i].showDetails();
      }
    }
  }
  
  public void checkIn(){
    System.out.println("No members given");
  }
  public void checkIn(Member m){
    if(count==cap) System.out.println("Gym is full!");
    else if(!branch.equals(m.branch)) System.out.println("You are at the wrong branch!");
    else if(!m.status) System.out.println("Your membership is inactive!");
    else{
      mem[count] = m;
      count++;
      System.out.println(m.name + " checked in.");
    }
  }
  public void checkIn(Member m1, Member m2){
    checkIn(m1);
    checkIn(m2);
  }
}
