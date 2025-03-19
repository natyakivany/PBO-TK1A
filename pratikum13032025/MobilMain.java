/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratikum13032025;

import java.util.Scanner;

public class MobilMain {
    public static void main(String[] args){
        Mobil mobil1=new Mobil();
        mobil1.merk = "Toyota";
        mobil1.plat ="BA 111 AL";
        mobil1.tahun = 2000;
        mobil1.warna ="Hitam";
        
        System.out.println("Merk mobil anda = "+mobil1.merk);
        System.out.println("No plat mobill = "+mobil1.plat);
        System.out.println("Tahun keluaran = "+mobil1.tahun);
        System.out.println("Warna mobil = "+mobil1.warna);
        mobil1.MobilAktif();
        System.out.println(mobil1.suaraMobil());
    } 
    
    
}
