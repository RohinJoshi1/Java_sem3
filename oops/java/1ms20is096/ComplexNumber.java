import java.util.Scanner;
class ComplexNumber {
  double real,img;
  ComplexNumber(double real,double img){
    this.real = real;
    this.img = img;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter real and imaginary part of first number");
    int real = sc.nextInt();
    int img = sc.nextInt();
    ComplexNumber c1 = new ComplexNumber(real,img);
    System.out.println("Enter real and imaginary part of second number");
    int real1 = sc.nextInt();
    int img1 = sc.nextInt();
    ComplexNumber c2 = new ComplexNumber(real1,img1);
    ComplexNumber temp = sum(c1, c2);
    System.out.println("Sum is: "+ temp.real+" + "+ temp.img +"i");
    ComplexNumber dif = subtract(c1, c2);
    System.out.println("Sum is: "+ dif.real+" + "+ dif.img +"i");
    ComplexNumber mul = product(c1, c2);
    System.out.println("product is: "+ mul.real+" + "+ mul.img +"i");
  }
  public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2)
  {

       ComplexNumber temp = new ComplexNumber(0, 0);

       temp.real = c1.real + c2.real;
       temp.img = c1.img + c2.img;
       return temp;
   }
   public static ComplexNumber subtract(ComplexNumber c1, ComplexNumber c2)
   {

        ComplexNumber temp = new ComplexNumber(0, 0);

        temp.real = c1.real - c2.real;
        temp.img = c1.img - c2.img;
        return temp;
    }
    public static ComplexNumber product(ComplexNumber c1, ComplexNumber c2)
    {

         ComplexNumber temp = new ComplexNumber(0, 0);

         temp.real = c1.real * c2.real - (c1.img*c2.img);
         temp.img = c1.img * c2.real + (c1.real*c2.img);
         return temp;
     }

}
