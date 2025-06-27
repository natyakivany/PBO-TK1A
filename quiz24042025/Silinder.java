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
public class Silinder extends Kerucut {
    private double tinggi;
    
    public Silinder(){
        super();
        this.tinggi=0;
        
    }
    
    public Silinder(double r, double t){
       super();
       this.tinggi = t;
    }
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
        
    }
    public double getTinggi(){
        return tinggi;
        
    }
    public double getVolume(){
        return super.getLuas()*tinggi;
    }
    public String toString(){
        return "Silinder dengan r :"+ super.getR()+
                "Tinggi:"+tinggi+
                "Volume:"+getVolume();
        
    }
    public double getLuas(){
        double luasSelimut = 2 * Math.PI * super.getR() * tinggi;
        double luasAlas = super.getLuas();
        return 2 * luasAlas + luasSelimut;
        
    }
}
