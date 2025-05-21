/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratikumk15052025;

/**
 *
 * @author user
 */
public class Kendaraan {
    protected int jmlRoda;
    protected String warna;
    
    public Kendaraan (){
    
    }
    public Kendaraan (int jmlRoda, String warna){
        this.warna=warna;
        this.jmlRoda=jmlRoda;
    }
    public void setJmlRoda (){
        this.jmlRoda = jmlRoda;
    }
    public int getJmlRoda (){
        return jmlRoda;
    }
    public void setWarna(){
        this.warna=warna;
    }
    public String getWarna(){
        return warna;
    }
    public void display (){
        System.out.println("Kendaraan");
        System.out.println("Jumlah Roda "+this.jmlRoda);
        System.out.println("Warna Kendaraan  "+this.warna);
        
    }
}
