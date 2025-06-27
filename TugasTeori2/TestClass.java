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
public class TestClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape s1 = new Circle("RED", false, 5.5); // upcast Circle to Shape
        System.out.println(s1);                      // Circle's toString()
        System.out.println(s1.getArea());            // Circle's getArea()
        System.out.println(s1.getPerimeter());       // Circle's getPerimeter()
        System.out.println(s1.getColor());           // Shape method
        System.out.println(s1.isFilled());           // Shape method
        System.out.println(((Circle) s1).getRadius()); // Downcast to Circle to access getRadius()

        Circle c1 = (Circle) s1; // downcast to Circle
        System.out.println(c1);                   // Circle's toString()
        System.out.println(c1.getArea());         // Circle's getArea()
        System.out.println(c1.getPerimeter());    // Circle's getPerimeter()
        System.out.println(c1.getColor());        // Shape method
        System.out.println(c1.isFilled());        // Shape method
        System.out.println(c1.getRadius());       // Circle-specific method

        // Shape s2 = new Shape(); // ❌ ERROR: Shape is abstract, so cannot be instantiated

        Shape s3 = new Rectangle("RED", false,1.0, 2.0); // upcast
        System.out.println(s3);                   // Rectangle's toString()
        System.out.println(s3.getArea());         // Rectangle's getArea()
        System.out.println(s3.getPerimeter());    // Rectangle's getPerimeter()
        System.out.println(s3.getColor());        // Shape method
        System.out.println(((Rectangle) s3).getLength()); // Downcast to access getLength()

        Rectangle r1 = (Rectangle) s3; // downcast
        System.out.println(r1.getArea());        // Rectangle's getArea()
        System.out.println(r1.getColor());       // Shape method
        System.out.println(r1.getLength());      // Rectangle-specific method

        Shape s4 = new Square(6.6); // upcast to Shape
        System.out.println(s4);                   // Square's toString()
        System.out.println(s4.getArea());         // Square's getArea()
        System.out.println(s4.getColor());        // Shape method
        System.out.println(((Square) s4).getSide()); // Downcast to access getSide()

        // Downcast Shape s4 to Rectangle (superclass of Square)
        Rectangle r2 = (Rectangle) s4;
        System.out.println(r2.getArea());         // Rectangle's getArea()
        System.out.println(r2.getColor());        // Shape method
        System.out.println(r2.getLength());       // Rectangle method
        System.out.println(((Square) r2).getSide()); // Downcast to Square to access getSide()

        // Downcast Rectangle r2 to Square
        Square sq1 = (Square) r2;
        System.out.println(sq1.getArea());        // Square's getArea()
        System.out.println(sq1.getColor());       // Shape method
        System.out.println(sq1.getSide());        // Square-specific method
        System.out.println(sq1.getLength());      // Rectangle method (overridden)
    }
}