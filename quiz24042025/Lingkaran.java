/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz24042025;

/**
 *
 * @author user
 */
public class Lingkaran {
    private double r;
    
    public Lingkaran(){
        this.r = 0;
    }
    
    public Lingkaran(double r){
        this.r = 0;
    }
   
    public void setR(double r){
        this.r = r;
    }
    public double getR(){
        return r;
    }
    public double getDiameter(){
        return 2 * r;
    }
    public double getKeliling(){
        return Math.PI *r;
    }
    public double getLuas(){
         return Math.PI * r * r;
    }
    public String toString(){
        return "Lingkaran r : "+r+
               "Diameter = " + getDiameter() +
               "keliling = " + getKeliling() +
               "Luas = " + getLuas() ;
    }
}
    
    