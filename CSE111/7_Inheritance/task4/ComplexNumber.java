public class ComplexNumber extends RealNumber{
  double imaginary;
  
  public ComplexNumber(){
    super(1.0);
    imaginary = 1.0;
  }
  public ComplexNumber(double real, double imaginary){
    super(real);
    this.imaginary = imaginary;
  }
  
  public String details(){
    return getReal() + "\nImaginaryPart: " + imaginary;
  }
}
