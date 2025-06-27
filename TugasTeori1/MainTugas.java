/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasTeori1;
import java.util.Scanner;

public class MainTugas {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("=== PROGRAM BANGUN DATAR ===");
            System.out.println("1. Lingkaran");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Persegi");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    // Lingkaran
                    System.out.println("\n=== Lingkaran ===");
                    System.out.print("Masukkan radius: ");
                    double radius = input.nextDouble();

                    System.out.print("Gunakan warna default 'red' dan filled true? (y/n): ");
                    String jawaban = input.next();

                    if (jawaban.equalsIgnoreCase("y")) {
                        Circle circleDefault = new Circle(radius);
                        tampilkanInfoLingkaran(circleDefault);
                    } else {
                        System.out.print("Masukkan warna: ");
                        String color = input.next();
                        System.out.print("Apakah terisi? (true/false): ");
                        boolean filled = input.nextBoolean();

                        Circle circleCustom = new Circle(color, filled, radius);
                        tampilkanInfoLingkaran(circleCustom);
                    }
                    break;

                case 2:
                    // Persegi Panjang
                    System.out.println("\n=== Persegi Panjang ===");
                    System.out.print("Masukkan lebar: ");
                    double width = input.nextDouble();
                    System.out.print("Masukkan panjang: ");
                    double length = input.nextDouble();

                    System.out.print("Gunakan warna default 'red' dan filled true? (y/n): ");
                    jawaban = input.next();

                    if (jawaban.equalsIgnoreCase("y")) {
                        Rectangle rectDefault = new Rectangle(width, length);
                        tampilkanInfoPersegiPanjang(rectDefault);
                    } else {
                        System.out.print("Masukkan warna: ");
                        String color = input.next();
                        System.out.print("Apakah terisi? (true/false): ");
                        boolean filled = input.nextBoolean();

                        Rectangle rectCustom = new Rectangle(color, filled, width, length);
                        tampilkanInfoPersegiPanjang(rectCustom);
                    }
                    break;

                case 3:
                    // Persegi
                    System.out.println("\n=== Persegi ===");
                    System.out.print("Masukkan sisi: ");
                    double side = input.nextDouble();

                    System.out.print("Gunakan warna default 'red' dan filled true? (y/n): ");
                    jawaban = input.next();

                    if (jawaban.equalsIgnoreCase("y")) {
                        Square squareDefault = new Square(side);
                        tampilkanInfoPersegi(squareDefault);
                    } else {
                        System.out.print("Masukkan warna: ");
                        String color = input.next();
                        System.out.print("Apakah terisi? (true/false): ");
                        boolean filled = input.nextBoolean();

                        Square squareCustom = new Square(color, filled, side);
                        tampilkanInfoPersegi(squareCustom);
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.\n");
            }

        } while (pilihan != 4);

        input.close();
    }

    // Method untuk menampilkan info lingkaran
    private static void tampilkanInfoLingkaran(Circle c) {
        System.out.println("\nInformasi Lingkaran:");
        System.out.println("Radius: " + c.getRadius());
        System.out.println("Warna: " + c.getColor());
        System.out.println("Apakah terisi? " + (c.isFilled() ? "Ya" : "Tidak"));
        System.out.println("Luas: " + c.getArea());
        System.out.println("Keliling: " + c.getPerimeter());
        System.out.println();
    }

    // Method untuk menampilkan info persegi panjang
    private static void tampilkanInfoPersegiPanjang(Rectangle r) {
        System.out.println("\nInformasi Persegi Panjang:");
        System.out.println("Lebar: " + r.getWidth());
        System.out.println("Panjang: " + r.getLength());
        System.out.println("Warna: " + r.getColor());
        System.out.println("Apakah terisi? " + (r.isFilled() ? "Ya" : "Tidak"));
        System.out.println("Luas: " + r.getArea());
        System.out.println("Keliling: " + r.getPerimeter());
        System.out.println();
    }

    // Method untuk menampilkan info persegi
    private static void tampilkanInfoPersegi(Square s) {
        System.out.println("\nInformasi Persegi:");
        System.out.println("Sisi: " + s.getSide());
        System.out.println("Warna: " + s.getColor());
        System.out.println("Apakah terisi? " + (s.isFilled() ? "Ya" : "Tidak"));
        System.out.println("Luas: " + s.getArea());
        System.out.println("Keliling: " + s.getPerimeter());
        System.out.println();
    }
    
    
}
