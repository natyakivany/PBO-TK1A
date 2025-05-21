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
public class Elektronik {
   private String merek;
    private int tahunProduksi;
    private int garansi;
    
    public Elektronik(){
        
    }
    
    public String getMerek(){
        return merek;
    }
    
    public void setMerek (String merek){
        this.merek = merek;
    }
    
    public int getTahunProduksi (){
        return tahunProduksi;
    }
    
    public void setTahunProduksi (int TahunProduksi){
        this.tahunProduksi = tahunProduksi;
    }
    
    public int getGaransi (){
        return garansi;
    }
    
    public void setGaransi (int garansi){
        this.garansi = garansi;
    }
    
    @Override
    public String toString(){
        return "Elektronik: " + merek +
                "\nMerek: " + getMerek() +
                "\nTahunProduksi : " + getTahunProduksi() +
                "\nGaransi: " + getGaransi();
    }
    
}    
