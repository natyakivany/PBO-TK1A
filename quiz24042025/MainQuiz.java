/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz24042025;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class MainQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner scanner = new Scanner(System.in);
          int pilihan;
          
          System.out.print("\nPilih Bangunnya:");
          System.out.print("1. Lingkaran");
          System.out.print("2. kerucut:");
          System.out.print("3. silinder:");
          System.out.print("4. keluar:");
          pilihan = scanner.nextInt();
          
          switch (pilihan){
              case 1:
                System.out.print("Masukkan jarijari:");
                double rLingkaran = scanner.nextDouble();
                Lingkaran lingkaran = new Lingkaran(rLingkaran);
                System.out.print("Diameter:"+ lingkaran.getDiameter());
                System.out.print("Keliling:"+ lingkaran.getKeliling());
                System.out.print("Luas:"+ lingkaran.getLuas());
               break;
              case 2:
                System.out.print("Masukkan jarijari:");
                double rKerucut = scanner.nextDouble(); 
                System.out.print("Masukkan tinggi:");
                double tKerucut = scanner.nextDouble(); 
                Kerucut kerucut= new Kerucut(rKerucut, tKerucut);
                System.out.print("volume kerucut:"+ kerucut.getVolume());
                System.out.print("luas selimut:"+ kerucut.getLuas());
              
              case 3:
                System.out.print("Masukkan jarijari:");
                double rSilinder = scanner.nextDouble(); 
                System.out.print("Masukkan tinggi:");
                double tSilinder = scanner.nextDouble(); 
                Silinder silinder= new Silinder(rSilinder, tSilinder);
                System.out.print("volume kerucut:"+ silinder.getVolume());
                System.out.print("luas selimut:"+ silinder.getLuas());
              
              case 4:
                  System.out.print("Terima kasih dari program" );
              
              default:
                  System.out.print("Pilihan tidak valid, silkam coba lagi");
                    }
                 while (pilihan != 4);
    
                 scanner.close();

}

} 
                  
          
          
   
    

