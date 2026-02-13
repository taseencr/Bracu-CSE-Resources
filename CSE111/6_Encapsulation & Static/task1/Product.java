public class Product{
  String name;
  int qty;
  
  static int count;
  static Product products[] = new Product[3];
  
  public Product(String name, int qty){
    if(count<3){
      this.name = name;
      this.qty = qty;
      products[count] = this;
      count++;
      System.out.println("Stored: " + name);
    }
    else System.out.println("Storage is full! Cannot add " + name);
  }
  
  public static void displayProducts(){
    System.out.println("=== Stored Products ===");
    for(int i=0; i<count; i++){
      System.out.println(products[i].name + " - Qty: " + products[i].qty);
    }
  }
  
  public static void buy(String name, int qty){
    int idx = -1;
    for(int i=0; i<count; i++){
      if(name.equals(products[i].name)){
        idx = i;
        break;
      }
    }
    if(idx>-1){
      if(products[idx].qty<qty) System.out.println("Quantity low");
      else{
        products[idx].qty -= qty;
        System.out.println("Product Sold");
      }
    }
    else System.out.println("Product not found");
  }
}
