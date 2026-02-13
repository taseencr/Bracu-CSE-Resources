public class Animalkeepers{
  static int count;
  static int tcount;
  static String Animals[] = {"Lion", "Tiger", "Seal", "Gorilla", "Deer"};
  static Animalkeepers peep[] = new Animalkeepers[Animals.length];
  static String tasks[] = new String[Animals.length];
  private int id;
  String name;
  
  public int getid(){
    return id;
  }
  public void setid(int id){
    this.id = id;
  }

  public Animalkeepers(String name){
    this.name = name;
    count++;
    setid(100+count);
    System.out.println(name + " with ID " + getid() + " got the job!");
  }
  
  public void doTask(String animal, String task){
    int idx = -1;
    for(int i=0; i<Animals.length; i++){
      if(animal.equals(Animals[i])){
        idx = i;
        break;
      }
    }
    if(idx==-1) System.out.println("Animal not in the Safari");
    else{
      tasks[idx] = task;
      peep[idx] = this;
      tcount = 0;
      for(int i=0; i<Animals.length; i++){
        if(tasks[i]!=null) tcount++;
      }
      System.out.println("Task assigned to " + name);
    }
  }
  
  public static void printTasks(){
    if(tcount==0) System.out.println("No tasks assigned.");
    else{
      for(int i=0; i<peep.length; i++){
        if(tasks[i]!=null){
          System.out.println(tasks[i] + " (Keeper - " + peep[i].name + ") === " + Animals[i]);
        }
      }
    }
  }
  
  public static void details(){
    if(count==0) System.out.println("No Animal Keepers working yet.");
    else{
      System.out.println("Total Animal Keeper: " + count);
      System.out.println("Total Task assigned: " + tcount);
      printTasks();
    }
  }
}
