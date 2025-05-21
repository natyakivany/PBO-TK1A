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
public class SepedaListrik extends Sepeda {
  protected int kecepatanMaks;
    protected int jarakTempuh;
    
    public SepedaListrik(){
    }
    
    public SepedaListrik(int kecepatanMaks,int jarakTempuh){
        this.kecepatanMaks=kecepatanMaks;
        this.jarakTempuh=jarakTempuh;   
    }
    
    public SepedaListrik(int jmlRoda, String warna, String jmlSadel,int jmlGir, int kecepatanMaks,int jarakTempuh){
        super (jmlRoda,warna,jmlSadel,jmlGir);
        this.kecepatanMaks=kecepatanMaks;
        this.jarakTempuh=jarakTempuh;   
    }
    
    public void setKecepatanMaks(){
        this.kecepatanMaks=kecepatanMaks;
    }
    
    public int getKecepatanMaks(){
        return kecepatanMaks;
    }
    
    public void setJarakTempuh(){
        this.jarakTempuh=jarakTempuh;
    }
    
    public int getJarakTempuh(){
        return jarakTempuh;
    }
    
    @Override
    public void display (){
        System.out.println("Sepeda Listrik");
        System.out.println("Tahun Produksi :"+this.jmlRoda);
        System.out.println("Warna Kendaraan :"+this.warna);
        System.out.println("Jumlah Sadel :"+this.jmlSadel);
        System.out.println("Jumlah Gir :"+this.jmlGir);
        System.out.println("Kecepatan Maks :"+this.kecepatanMaks);
        System.out.println("Jarak Tempuh :"+this.jarakTempuh);
    }
}
