public class ConnectFriends{
  String name;
  int limit;
  ConnectFriends friends[];
  int count;
  
  public ConnectFriends(String name, int limit){
    this.name = name;
    this.limit = limit;
    friends = new ConnectFriends[limit];
    System.out.println("Welcome to ConnectFriends, " + name);
  }
  public ConnectFriends(String name){
    this(name, 2);
  }
  
  public void sendFriendRequest(ConnectFriends peep){
    if(count<limit){
      friends[count] = peep;
      count++;
      System.out.println(name + " sent a friend request to " + peep.name + ".");
    }
    else System.out.println(name + " has reached the friend request limit!");
  }
  public void sendFriendRequest(ConnectFriends peep1, ConnectFriends peep2){
    sendFriendRequest(peep1);
    sendFriendRequest(peep2);
  }
  
  public void showDetails(){
    System.out.println("User Name: " + name);
    System.out.println("Maximum number of Sent Friend Request: " + limit);
    System.out.println("Total Friends Request: " + count);
    System.out.print("Sent Friends Request: ");
    for(int i=0; i<count; i++){
      System.out.print(friends[i].name + " ");
    }
    System.out.println();
  }
  
  public void removeRequest(String rname){
    int idx = -1;
    for(int i=0; i<count; i++){
      if(friends[i].name.equals(rname)) idx = i;
    }
    if(idx==-1) System.out.println(rname + " is not in " + name + "'s sent request list.");
    else{
      for(int i=idx; i<count-1; i++){
        friends[i] = friends[i+1];
      }
      count--;
      System.out.println("Request to add " + rname + " is removed for " + name + ".");
    }
  }
}
