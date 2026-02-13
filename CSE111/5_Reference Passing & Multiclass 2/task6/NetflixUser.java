public class NetflixUser{
  String name;
  String type;
  Movie movies[] = new Movie[3];
  int count;
  
  public NetflixUser(String name, String type){
    this.name = name;
    this.type = type;
    System.out.println("New user account created!");
  }
  public NetflixUser(String name){
    this(name, "Free");
  }
  
  public void addToFavourites(Movie obj){
    if(type.equals("Free")) System.out.println("Cannot add movies to favourites. Please upgrade to Netflix Premium.");
    else if(type.equals("Premium")){
      if(count<3){
        movies[count] = obj;
        count++;
        System.out.println("Movie added to favourites.");
      }
      else System.out.println("Cannot add new movies. Favourites list is full.");
    }
  }
  
  public void showFavourites(){
    if(count==0 && type.equals("Free")) System.out.println("No available favourites. Please upgrade to Netflix Premium.");
    else{
      System.out.println("Showing " + name + "'s Favourites: ");
      for(int i=0; i<count; i++){
        System.out.println(movies[i].name + ", " + movies[i].type + ", Duration: " + movies[i].duration);
      }
    }
  }
  
  public void upgradePlan(){
    if(type.equals("Premium")) System.out.println("You already have Netflix Premium!");
    else{
      type = "Premium";
      System.out.println("Welcome to Netflix Premium!");
    }
  }
}
