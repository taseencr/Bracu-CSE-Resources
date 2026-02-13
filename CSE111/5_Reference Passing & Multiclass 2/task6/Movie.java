public class Movie{
  String name;
  String type;
  String duration;
  
  public Movie(String name, String type, String duration){
    this.name = name;
    this.type = type;
    this.duration = duration;
  }
  public Movie(String name, String type){
    this(name, type, "Unknown");
  }
}
