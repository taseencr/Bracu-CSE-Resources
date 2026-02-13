public class MobilePhone{
  int cap = 0;
  int count = 0;
  String[] contacts;
  int[] numbers;
  
  public void setContactCapacity(int cap){
    this.cap = cap;
    contacts = new String[cap];
    numbers = new int[cap];
  }
  
  public void details(){
    System.out.println("Total Contacts: " + count);
    System.out.println("Contact List: ");
    for(int i=0; i<count; i++){
      System.out.println(contacts[i] + ":" + numbers[i]);
    }
  }
  
  public void addContact(String name, int num){
    if(count<cap){
      contacts[count] = name;
      numbers[count] = num;
      count++;
      System.out.println("The contact of " + name + " is added.");
    }
    else System.out.println("Storage Full!");
  }
  
  public void makeCall(int num){
    boolean isFound = false;
    for(int i=0; i<count; i++){
      if(numbers[i]==num){
        System.out.println("Calling " + contacts[i] + " . . .");
        isFound = true;
      }
    }
    if(!isFound) System.out.println("Calling " + num + " . . .");
  }
}
