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
public abstract class Shape {
    protected String color = "red";
    protected boolean filled = true;
    
    public Shape(){
        
    }
    public Shape(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }
    
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public boolean isFilled(){
      return filled;  
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    @Override
    public String toString(){
    return "Shape[color=" + getColor() + ", filled=" + isFilled()+ "]";
    }
}

    
