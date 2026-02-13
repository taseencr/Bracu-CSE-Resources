public class SmartSecurityCamera extends SmartDevice{
  int storage;
  int currentstr;
  boolean isIR;
  
  public SmartSecurityCamera(String name, int bat, int str){
    super(name, bat);
    storage = str;
    currentstr = str;
  }
  
  public void powerOn(){
    if(currentstr<=0) System.out.println("Error: " + deviceName + " storage full.\nRecording disabled.");
    else super.powerOn();
  }
  
  public void record(){
    if(currentstr>0){
      System.out.println("Recording standard footage.");
      currentstr--;
    }
    else System.out.println("Error: " + deviceName + " storage full.\nRecording disabled.");
  }
  public void record(boolean isIR){
    if(isIR){
      this.isIR = true;
      System.out.println("[IR SENSORS ACTIVE]");
      record();
    }
    else record();
  }
  
  public void formatCard(String pass){
    System.out.println("REQUEST: Format SD Card initiated.");
    if(isActive){
      if(pass.equals("ADMIN123")){
        currentstr = storage;
        System.out.println("Auth Success. Wiping data.\nSUCCESS: Storage restored to " + storage + "GB.");
      }
      else System.out.println("ACCESS DENIED: Incorrect PIN.");
    }
    else System.out.println("ERROR: Device must be ON to format.");
  }
  
  public void powerOff(){
    if(isIR){
      isIR = false;
      System.out.println("Turning off Night Vision.");
    }
    super.powerOff();
  }
}
