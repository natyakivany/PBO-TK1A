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
public class SmartWatch extends SmartPhone {
    private int ukuranLayar;
    private boolean tahanAir;
    
    public SmartWatch(){
        
    }
    public int getUkuranLayar(){
        return ukuranLayar;
    }
    public void setUkuranLayar(int ukuranLayar){
        this.ukuranLayar=ukuranLayar;
    }
    public boolean isTahanAir(){
       if(tahanAir){
           return true;
       }return false;
        
        
    }
    public boolean setTahanAir(boolean tahanAir){
        this.tahanAir=tahanAir;
        if(tahanAir){
            return true;
        }return false;
    }
    
    @Override
    public String toString(){
        return "Ukuran layar Smartwatchnya:"+getUkuranLayar()+
                "Smartwatchnya anti air?(ya/tidak)"+isTahanAir();
    }
}


