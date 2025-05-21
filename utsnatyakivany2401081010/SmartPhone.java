/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsnatyakivany2401081010;

/**
 *
 * @author user
 */
public class SmartPhone extends Elektronik {
    private int kapasitasBaterai;
    private int jumlahKamera;
    
    public SmartPhone(){
    }
    
    public void setkapasitasBaterai(int kapasitasBaterai){
        this.kapasitasBaterai = kapasitasBaterai;
    }
    
    public int getkapasitasBaterai(){
        return kapasitasBaterai;
    }
   
    public void setjumlahKamera(int jumlahKamera){
        this.jumlahKamera = jumlahKamera;
    }
    
    public int getjumlahKamera(){
        return jumlahKamera;
    }
    
    @Override
    public String toString(){
        return "Smartphone dgn kapasitas baterai:"+getkapasitasBaterai()+
                "\n Smartphone ada kamera:"+getjumlahKamera();
    }
}


