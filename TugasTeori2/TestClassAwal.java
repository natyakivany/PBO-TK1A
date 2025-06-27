/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasTeori2;

/**
 *
 * @author user
 */
public class TestClassAwal {
    public static void main(String[]args){
    Shape s1= new Circle(5.5,"RED",false);//upcast circle to shape
    System.out.println(s1);//which version
    System.out.println(s1.getArea());//which version
    System.out.println(s1.getPerimeter());//which version
    System.out.println(s1.getColor());
    System.out.println(s1.isFilled());
    System.out.println(s1.getRadius());
    
    Circle c1=(Circle)s1;//downcast to circle
    System.out.println(c1);
    System.out.println(c1.getArea());
    System.out.println(c1.getPerimeter());
    System.out.println(c1.getColor());
    System.out.println(c1.isFilled());
    System.out.println(c1.getRadius());
    
    Shape s2=new Shape();
    
    Shape s3 = new Rectangle(1.0,2.0,"RED",false);//upcast
    System.out.println(s3);
    System.out.println(s3.getArea());
    System.out.println(s3.getPerimeter());
    System.out.println(s3.getColor());
    System.out.println(s3.getLength());
    
    Rectangle r1=(Rectangle)s3;//dwoncast
    System.out.println(r1.getArea());
    System.out.println(r1.getColor());
    System.out.println(r1.getLength());
    
    Shape s4= new Square(6.6);//upcast
    System.out.println(s4);
    System.out.println(s4.getArea());
    System.out.println(s4.getColor());
    System.out.println(s4.getSide());
    
    //take note that we downcast shape s4 to rectangle
    //which is superclass of square, instead of Square
    Rectangle r2=(Rectangle)s4;
    System.out.println(r2.getArea());
    System.out.println(r2.getColor());
    System.out.println(r2.getSide());
    System.out.println(r2.getLength());
     
     //dwoncast rectangle r2 to square
    Square sq1=(Square)r2;
    System.out.println(sq1.getArea());
    System.out.println(sq1.getColor());
    System.out.println(sq1.getSide());
    System.out.println(sq1.getLength());
   }
}
   