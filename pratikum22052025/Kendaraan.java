/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratikum22052025;

/**
 *
 * @author user
 */
public abstract class Kendaraan {
    protected String merk;
    protected int tahun;
    
    public Kendaraan(String merk, int tahun){
        this.merk = merk;
        this.tahun = tahun;
    }
    
    public String getMerk(){
        return merk;
    }
    public void setMerk(){
        this.merk = merk;
    }
    
    public int getTahun(){
        return tahun;
    }
    public void setTahun(){
        this.tahun = tahun;
    }
    public void nyalakan(){
        System.out.println("Kendaraan dinyalakan");  
    }
    
    public void matikan(){
        System.out.println("Kendaraan dimatikan");
    }
    
    public abstract void info();
    public abstract void periksaKondisi();
    public abstract void servis();
    
}
