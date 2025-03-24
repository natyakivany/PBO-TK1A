/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratikum20032025;

/**
 *
 * @author user
 */
public class PersegiPanjang {
    int panjang;
    int lebar;
    public static int JumlahObjek=0;
    
    public PersegiPanjang(){
        JumlahObjek++;
    }
    
    
    public PersegiPanjang(int panjangBaru, int lebarBaru){
        this.panjang=panjangBaru;
        this.lebar=lebarBaru;
        JumlahObjek++;
    }
   
    public int getLuas(){
        return(panjang*lebar);
    }
    
    public int getKeliling(){
        return 2*(panjang+lebar);
    }
    
}
