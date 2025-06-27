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
public class Kerucut extends Lingkaran {
    private double tinggi;
    
    public Kerucut(){
        super();
        this.tinggi=0;
        
    }
    public Kerucut (double r, double t){
    super(r);
    this.tinggi = t;
    }
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    public double getTinggi(){
        return tinggi;
        
    }
    public double getVolume(){
        return (1.0 / 3) * super.getLuas() * tinggi;
        
    }
    public String toString(){
        return"Kerucut dengan r :"+super.getR()+
                "Tinggi :" + tinggi +
                "Volume :" + getVolume() +
                "Luas : "+ getLuas();
        
    }
    public double getLuas(){
        double s = Math.sqrt(super.getR() * tinggi * tinggi);
        return super.getLuas()+(Math.PI*super.getR()* s);
        
    }
}

