/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratikum22052025;


/**
 *
 * @author user
 */
public class KendaraanMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Mobil mobil = new Mobil("Toyota Avanza", 2022,4,"Automatic") {};
      Motor motor = new Motor("Yamahe NMAX",2023,"Full Face", 155) {};
      
      mobil.nyalakan();
      mobil.info();
      mobil.periksaKondisi();
      mobil.servis();
      mobil.matikan();
      
      System.out.println();
      motor.nyalakan();
      motor.info();
      motor.periksaKondisi();
      motor.servis();
      motor.matikan();
      
    }
    
}
