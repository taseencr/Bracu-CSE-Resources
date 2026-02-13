public class Triangle{
  int side1, side2, side3, perimeter;
  
  public Triangle(int a, int b, int c){
    side1 = a;
    side2 = b;
    side3 = c;
    perimeter = a+b+c;
  }
  
  public void triangleDetails(){
    System.out.println("Three sides of the triangle are: " + side1 + ", " + side2 + ", " + side3);
    System.out.println("Perimeter: " + perimeter);
  }
  
  public String printTriangleType(){
    if(side1==side2 && side2==side3) return "This is an Equilateral Triangle.";
    else return "This is a Scalene Triangle.";
  }
  
  public void compareTriangles(Triangle obj){
    if(this==obj){
      System.out.println("These two triangle objects have the same address.");
    }
    else if(side1==obj.side1 && side2==obj.side2 && side3==obj.side3){
      System.out.println("Addresses are different but the sides of the triangles are equal.");
    }
    else if(obj.perimeter==perimeter){
      System.out.println("Only the perimeter of both triangles is equal.");
    }
    else System.out.println("Addresses, length of the sides and perimeter all are different.");
  }
}
