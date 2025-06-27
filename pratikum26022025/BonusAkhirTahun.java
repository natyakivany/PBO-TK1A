/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum26022025;

import java.util.Scanner;
/**
 *
 * @author LAB-MM
 */
public class BonusAkhirTahun {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int gol,masakerja,umur;
        long bonus = 0;
        System.out.println("====Program Bonus Akhir Tahun====");
        System.out.println("Golongan Karyawan : \n 1. staf\n 2. Non-Staf");
        System.out.println("===================================");
        System.out.println("Golongan anda (1/2)\t: ");
        gol = in.nextInt();
        System.out.println("Lama kerja\t\t: ");
        masakerja=in.nextInt();
        System.out.println("Usia\t\t\t: ");
        umur=in.nextInt();
        switch(gol){
            case 1: //staf
            {
                if(masakerja>=5 && umur>=45)
                    bonus=10000000;
                else if(masakerja>=5 && umur<45)
                    bonus=7000000;
                else//masa kerja kurang dari 5 berapapun umurnya
                    bonus=5000000;
            }break;
            case 2: //non-staf
            {
                if(masakerja>=5 && umur>=45)
                    bonus=6000000;  
                else//selain kategori diatas 
                    bonus=2500000;
            }break;
            default:
            {
                System.out.println("Golongan Anda Salah");
                bonus=0;
            }break;
        }
        System.out.println("Bonus akhir Tahun anda\t: Rp."+bonus+",-");
    }
    }
    
