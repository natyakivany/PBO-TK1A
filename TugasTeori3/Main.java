/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasTeori3;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int pilihan;
        
        do {
            System.out.println("=== PROGRAM GEOMETRIC OBJECT ===");
            System.out.println("1. Lingkaran");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");
            while (!input.hasNextInt()) {
                System.out.println("Input tidak valid! Masukkan angka 1-3.");
                input.next(); // Buang input yang salah
                System.out.print("Pilih menu (1-3): ");
            }
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    // Input data untuk Lingkaran
                    System.out.print("\nMasukkan radius lingkaran: ");
                    double radius = input.nextDouble();
                    
                    Circle circle = new Circle(radius);
                    System.out.println("\nInformasi Lingkaran:");
                    System.out.println(circle.toString());
                    System.out.println();
                    break;

                case 2:
                    // Input data untuk Persegi Panjang
                    System.out.print("\nMasukkan lebar persegi panjang: ");
                    double width = input.nextDouble();
                    System.out.print("Masukkan panjang persegi panjang: ");
                    double length = input.nextDouble();
                    
                    Rectangle rectangle = new Rectangle(width, length);
                    System.out.println("\nInformasi Persegi Panjang:");
                    System.out.println(rectangle.toString());
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia. Silakan coba lagi.\n");
            }

        } while (pilihan != 3);

        input.close();
    }
}
  
