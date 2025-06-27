/*
Program : PersegiPanjang.java
Pembuat : Natya kivany

 */
package pratikum26022025;

import java.util.Scanner;
/**
 *
 * @author LAB-MM
 */
public class PersegiPanjang {
    public static void main(String[] args){
    int panjang,lebar,luas,kell;
    Scanner in = new Scanner (System.in);
    System.out.print("Panjang : ");
    panjang = in.nextInt();
    System.out.print("Lebar : ");
    lebar = in.nextInt();
    luas = panjang * lebar;
    kell = (2*panjang) + (2*lebar);
    System.out.println("luas ="+ luas);
    System.out.print("keliling ="+ kell);
    
    }
    
}
