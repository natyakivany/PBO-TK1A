/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class MainPembayaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== SISTEM PEMBAYARAN TOKO  ===");
        System.out.print("Masukkan total harga: Rp");
        double totalHarga = input.nextDouble();
        input.nextLine();
        
        System.out.println("\nPILIH METODE PEMBAYARAN:");
        System.out.println("1. Transfer Bank");
        System.out.println("2. Tunai");
        System.out.println("3. E-Wallet");
        System.out.println("4. Kartu Kredit");
        System.out.print("Pilihan Anda (1-4): ");
        
        int pilihan = input.nextInt();
        input.nextLine();
        
        Pembayaran transaksi = null;
        
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan nama bank Anda: ");
                String namaBank = input.nextLine();
                System.out.print("Masukkan nomor rekening: ");
                String nomorRekening = input.nextLine();
                transaksi = new Transfer(totalHarga, namaBank, nomorRekening);
                break;
            case 2:
                transaksi = new Cash(totalHarga);
                break;
            case 3:
                System.out.print("Masukkan provider E-Wallet (Gopay/OVO/Dana/LinkAja): ");
                String provider = input.nextLine();
                transaksi = new EWallet(totalHarga, provider);
                break;
            case 4:
                System.out.print("Masukkan nomor kartu kredit: ");
                String nomorKartu = input.nextLine();
                System.out.print("Masukkan bank penerbit: ");
                String bankPenerbit = input.nextLine();
                transaksi = new KartuKredit(totalHarga, nomorKartu, bankPenerbit);
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                System.exit(0);
        }
        
        transaksi.prosesPembayaran();
        
        System.out.println("\n=== RINGKASAN TRANSAKSI ===");
        System.out.println(transaksi.getDetailPembayaran());
        System.out.println("Status: " + (transaksi.getStatusPembayaran() ? "Berhasil" : "Gagal"));
        
        input.close();
    }
}
    