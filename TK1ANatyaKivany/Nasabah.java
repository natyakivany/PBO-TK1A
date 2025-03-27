/*
 * NATYA KIVANY
 * TK1A
 * 2402081010
 */
package TK1ANatyaKivany;


public class Nasabah {
    private String namaAwal;
    private String namaAkhir;
    private Tabungan tabungan;
    
    public Nasabah(String namaAwal, String namaAkhir){
        this.namaAwal = namaAwal;
        this.namaAkhir = namaAkhir;   
    }
    public void setTabungan(Tabungan tabungan){
        this.tabungan = tabungan;
    }
    
    public Tabungan getTabungan() {
        return tabungan;
    }
    
    @Override
    public String toString() {
        //return namaAwal + " " + namaAkhir + "-" + (tabungan != null ? tabungan.toString() : "Tidak ada tabungan");
        if(tabungan !=null) {
            return namaAwal + " " + namaAkhir + "-" + tabungan.toString();
        }else{
            return namaAwal + " " + namaAkhir + "- Tidak ada tabungan";
        }
    }
}