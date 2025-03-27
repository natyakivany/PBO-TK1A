/*
 * natya kivany
 * TK 1A
 * 2401081010
 */
package TK1ANatyaKivany;

public class TestBank {

    public static void main(String[] args) {
        // TODO code application logic here
         // Membuat objek Bank
        Bank bank = new Bank();

        // Menambahkan nasabah sesuai dengan perintah pada gambar
        bank.tambahNasabah("Andi", "Sucipto", new Tabungan(20000)); // Nasabah dengan tabungan
        bank.tambahNasabah("Budi", "Pratama");                      // Nasabah tanpa tabungan
        bank.tambahNasabah("Candra", "Dinata", new Tabungan(15000)); // Nasabah dengan tabungan
        bank.tambahNasabah("Dede", "Kusuma", new Tabungan(25000));   // Nasabah dengan tabungan
        bank.tambahNasabah("Dede", "Andika");                       // Nasabah tanpa tabungan
        bank.tambahNasabah("Budi", "Dirgantara", new Tabungan(30000)); // Nasabah dengan tabungan

        // Tampilkan semua nasabah yang ada
        System.out.println("Daftar semua nasabah:");
        for (int i = 0; i < bank.getJumlahNasabah(); i++) {
            Nasabah nasabah = bank.getNasabah(i);
            System.out.println("Indeks " + i + ": " + nasabah);
        }
        System.out.println("Total jumlah nasabah: " + bank.getJumlahNasabah());

        // Dapatkan informasi nasabah pada indeks ke-3
        System.out.println("\nInformasi nasabah pada indeks ke-3:");
        Nasabah nasabahIndeks3 = bank.getNasabah(3);
        if (nasabahIndeks3 != null) {
            System.out.println(nasabahIndeks3);
        } else {
            System.out.println("Nasabah tidak ditemukan pada indeks ke-3.");
        }

        // Dapatkan informasi nasabah dengan namaAwal: Candra dan namaAkhir: Dinata
        System.out.println("\nMencari nasabah dengan nama Candra Dinata:");
        int indeksCandra = bank.searchNasabah("Candra", "Dinata");
        if (indeksCandra != -1) {
            System.out.println("Nasabah ditemukan pada indeks: " + indeksCandra);
            System.out.println(bank.getNasabah(indeksCandra));
        } else {
            System.out.println("Nasabah dengan nama Candra Dinata tidak ditemukan.");
        }

        // Dapatkan informasi nasabah dengan namaAwal: Dede
        System.out.println("\nMencari nasabah dengan nama awal Dede:");
        int[] indeksDede = bank.searchNasabah("Dede");
        if (indeksDede.length > 0) {
            System.out.println("Nasabah dengan nama awal Dede ditemukan pada indeks:");
            for (int indeks : indeksDede) {
                System.out.println("Indeks " + indeks + ": " + bank.getNasabah(indeks));
            }
        } else {
            System.out.println("Tidak ada nasabah dengan nama awal Dede.");
        }

        // Dapatkan informasi nasabah dengan namaAwal: Budi
        System.out.println("\nMencari nasabah dengan nama awal Budi:");
        int[] indeksBudi = bank.searchNasabah("Budi");
        if (indeksBudi.length > 0) {
            System.out.println("Nasabah dengan nama awal Budi ditemukan pada indeks:");
            for (int indeks : indeksBudi) {
                System.out.println("Indeks " + indeks + ": " + bank.getNasabah(indeks));
            }
        } else {
            System.out.println("Tidak ada nasabah dengan nama awal Budi.");
        }
    }
}
