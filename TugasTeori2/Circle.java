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
public class Circle extends Shape{
    protected double radius = 1.0;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + getColor() + ", filled=" + isFilled() +
               ", area=" + getArea() +
               ", perimeter=" + getPerimeter()+ "]";
    }
}

    

