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
public class Laptop extends Elektronik {
    private int ukuranLayar;
    private int kapasitasRAM;
    
    public Laptop (){
        
    }
    
    public Laptop(int ukuranLayar, int kapasitasRAM) {
        this.ukuranLayar = ukuranLayar;
        this.kapasitasRAM = kapasitasRAM;
    }
    
    public void setukuranLayar(int ukuranLayar) {
        this.ukuranLayar = ukuranLayar;
    }
    
    public int getukuranLayar() {
        return ukuranLayar;
    }
    
     public void setkapasitasRAM(int kapasitasRAM) {
        this.kapasitasRAM = kapasitasRAM;
    }
     
     public int getkapasitasRAM() {
        return kapasitasRAM;
     }
     
     @Override
     public String toString() {
        return "ukuran Layar: = " + ukuranLayar + ", kapasitas RAM = " + kapasitasRAM ;
     }
}
