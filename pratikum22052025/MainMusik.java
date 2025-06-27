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
public class MainMusik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // membuat objek statis
        Gitar gitar = new Gitar("Klasik","petik",6);
        Keyboard keyboard = new Keyboard("Yamaha","Elektronik");
        
        System.out.println("\n Alat Musik Gitar");
        gitar.info();
        gitar.mainkan();
        gitar.stem();
    }
    
}
