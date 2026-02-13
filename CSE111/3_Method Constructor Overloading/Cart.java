public class Cart{
  int num;
  int count;
  String[] name = new String[3];
  double[] price = new double[3];
  double discount;
  
  public void create_cart(int num){
    this.num = num;
  }
  
  public void addItem(String name, double price){
    if(count<3){
      this.name[count] = name;
      this.price[count] = price;
      count++;
      System.out.println(name + " added to cart " + num + ".");
      System.out.println("You have " + count + " item(s) in your cart now.");
    }
    else System.out.println("You already have 3 items on your cart");
  }
  
  public void addItem(double price, String name){
    addItem(name, price);
  }
  
  public void cartDetails(){
    double sum = 0;
    System.out.println("Your cart(c" + num + ") :");
    for(int i=0; i<count; i++){
      System.out.println(name[i] + " - " + price[i]);
      sum += price[i];
    }
    System.out.println("Discount Applied: " + discount + "%");
    double total = sum-sum*discount/100;
    System.out.println("Total price: " + total);
  }
  
  public void giveDiscount(double discount){
    this.discount = discount;
  }
}
