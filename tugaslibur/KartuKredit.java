/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaslibur;

/**
 *
 * @author user
 */
public class KartuKredit extends Pembayaran {
    public KartuKredit(double totalBayar) {
        super(totalBayar);
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Pembayaran dilakukan dengan kartu kredit sebesar " + totalBayar);
    }
}


