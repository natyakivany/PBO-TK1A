/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratikum20032025;

import java.util.Scanner;
public class TestVehicleEnkapsulasi {
    public static void main(String[] args) {
        // TODO code application logic here
        //berat maksimum kendaraan
        System.out.println("Buat kendaraan maksimum 10000");
        VehicleEnkapsulasi kend1=new VehicleEnkapsulasi(10000);
     
        //menambahkan berat kendaraan
        System.out.println("Menambahkan beban 1 (500 kg)" +kend1.addBox(500));
        System.out.println("Menambahkan beban 2 (1000 kg)"+kend1.addBox(1000));
        System.out.println("Menambahkan beban 3 (5000 kg)"+kend1.addBox(5000));
        System.out.println("Menambahkan beban 4 (750 kg)"+kend1.addBox(750));        
        System.out.println("Menambahkan beban 5 (3000 kg)"+kend1.addBox(3000));
         
        //beban kendaraan saat ini
        System.out.println("Beban Kendaraan saat ini");
        System.out.println(kend1.getLoad()+" kg");
        
        Scanner in = new Scanner(System.in);
        //buat objek kedua dengan kontruktor "kosong"
        VehicleEnkapsulasi kend2 = new VehicleEnkapsulasi();
        System.out.print("Beban maksimal kendaraan = ");
        double bebanmax = in.nextDouble();
        kend2.setMaxLoad(bebanmax);
        System.out.print("masukkan beban ke kendaraan berat =");
        double beban = in.nextDouble();
        while(kend2.addBox(beban)){
            kend2.addBox(beban);
            System.out.println("masukkan beban ke kendaraan berat = ");
            beban=in.nextDouble();
        }
        if(!kend2.addBox(beban)){
            System.out.println("maaf beban berlebih penambahan batal");
        }
        System.out.println("beban kendaraan saat ini");
        System.out.println(kend2.getLoad()+" kg");
    
     }
}
