//Convert minutes into approximate years and days
public class task1{
  public static void main(String[] args){
    int min = 3456789;
    int yrs = (min/1440) / 365;
    int days = (min/1440) % 365;
    System.out.println(min + " minutes is approximately " + yrs + " years and " + days + " days");
  }
}
