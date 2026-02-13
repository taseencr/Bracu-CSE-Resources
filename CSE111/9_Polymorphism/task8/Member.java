class Member{
  String name;
  String branch;
  boolean status;
  
  public Member(String name, String branch){
    this.name = name;
    this.branch = branch;
  }
  
  public void showDetails(){
    System.out.println("Member Name: " + name);
    System.out.println("Home Branch: " + branch);
    System.out.println("Membership Active? " + status);
  }
  
  public void activateMembership(){
    status = true;
  }
  
  public void updateBranch(String branch){
    this.branch = branch;
  }
}
