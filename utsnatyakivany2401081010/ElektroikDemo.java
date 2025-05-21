/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsnatyakivany2401081010;
import java.util.Scanner;
/**
 *
 * @author natya
 */
public class ElektroikDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        System.out.println("=== Pilih Jenis Elektronik ===");
        System.out.println("1. Elektronik");
        System.out.println("2. Laptop");
        System.out.println("3. PC Gaming");
        System.out.println("4. Smartphone");
        System.out.println("5. Smartwatch");
        System.out.print("Masukkan pilihan Anda (1-5): ");
        pilihan = input.nextInt();
        input.nextLine();

        switch (pilihan) {
            case 1: {
                Elektronik e = new Elektronik();
                System.out.print("Masukkan merek: ");
                e.setMerek(input.nextLine());
                System.out.print("Masukkan tahun produksi: ");
                e.setTahunProduksi(input.nextInt());
                System.out.print("Masukkan garansi (tahun): ");
                e.setGaransi(input.nextInt());

                System.out.println("\n== Data Elektronik ==");
                System.out.println(e);
            }
            case 2: {
                Laptop l = new Laptop();
                System.out.print("Masukkan merek: ");
                l.setMerek(input.nextLine());
                System.out.print("Masukkan tahun produksi: ");
                l.setTahunProduksi(input.nextInt());
                System.out.print("Masukkan garansi (tahun): ");
                l.setGaransi(input.nextInt());
                System.out.print("Masukkan ukuran layar (inci): ");
                l.setukuranLayar(input.nextInt());
                System.out.print("Masukkan kapasitas RAM (GB): ");
                l.setkapasitasRAM(input.nextInt());

                System.out.println("\n== Data Laptop ==");
                System.out.println(l);
            }
            case 3: {
                Gaming g = new Gaming();
                System.out.print("Masukkan merek: ");
                g.setMerek(input.nextLine());
                System.out.print("Masukkan tahun produksi: ");
                g.setTahunProduksi(input.nextInt());
                System.out.print("Masukkan garansi (tahun): ");
                g.setGaransi(input.nextInt());
                System.out.print("Masukkan ukuran layar (inci): ");
                g.setukuranLayar(input.nextInt());
                System.out.print("Masukkan kapasitas RAM (GB): ");
                g.setkapasitasRAM(input.nextInt());
                input.nextLine(); // Buang newline
                System.out.print("Masukkan jenis kartu grafis: ");
                g.setkartuGrafis(input.nextLine());
                System.out.print("Masukkan refresh rate (Hz): ");
                g.setrefreshRate(input.nextInt());

                System.out.println("\n== Data PC Gaming ==");
                System.out.println(g);
            }
            case 4: {
                SmartPhone s = new SmartPhone();
                System.out.print("Masukkan merek: ");
                s.setMerek(input.nextLine());
                System.out.print("Masukkan tahun produksi: ");
                s.setTahunProduksi(input.nextInt());
                System.out.print("Masukkan garansi (tahun): ");
                s.setGaransi(input.nextInt());
                System.out.print("Masukkan kapasitas baterai (mAh): ");
                s.setkapasitasBaterai(input.nextInt());
                System.out.print("Masukkan jumlah kamera: ");
                s.setjumlahKamera(input.nextInt());
                System.out.println("\n== Data Smartphone ==");
                System.out.println(s);
            }
            case 5: {
                SmartWatch sw = new SmartWatch();
                System.out.print("Masukkan merek: ");
                sw.setMerek(input.nextLine());
                System.out.print("Masukkan tahun produksi: ");
                sw.setTahunProduksi(input.nextInt());
                System.out.print("Masukkan garansi (tahun): ");
                sw.setGaransi(input.nextInt());
                System.out.print("Masukkan kapasitas baterai (mAh): ");
                sw.setkapasitasBaterai(input.nextInt());
                System.out.print("Masukkan jumlah kamera: ");
                sw.setjumlahKamera(input.nextInt());
                System.out.print("Masukkan ukuran layar (inci): ");
                sw.setUkuranLayar(input.nextInt());
                input.nextLine(); // Buang newline
                System.out.print("Apakah tahan air? (ya/tidak): ");
                String tahanAir = input.nextLine();
                sw.setTahanAir(tahanAir.equalsIgnoreCase("\nya"));

                System.out.println("\n== Data Smartwatch ==");
            }
            default : System.out.println("Pilihan tidak valid.");
        }
    }
}
