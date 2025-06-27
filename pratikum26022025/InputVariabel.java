/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum26022025;

import java.util.Scanner;
/**
 *
 * @author LAB-MM
 */
public class InputVariabel {
    public static void main(String[] args){
        String nama;//variabel string
        char jk;//variabel karakter
        int umur;//variabel bilangan bulat
        float ipk; //variabel bilangan berkoma
        boolean asal;//variabel logika (true/false)
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama anda : ");
        nama = input.nextLine();
        System.out.print("Masukkan jenis kelamin : ");
        jk = (char) input.nextInt();
        System.out.print("Masukkan nomor anda : ");
        umur = input.nextInt();
        System.out.print("Masukkan nilai IPK anda : ");
        ipk = input.nextFloat();
        System.out.println("Apakah anda berasal dari Padang(true/false");
        asal = input.nextBoolean();
        System.out.println("\n\n===Data Anda===");
        System.out.println("Nama :"+ nama);
        System.out.println("Umur :"+ umur +" tahun");
        System.out.println("Gender : "+ jk);
        System.out.println("IPK : "+ ipk);
        if(asal) //default
            System.out.println("Anda berasal dari Padang");
        else //asal = false
            System.out.println("Anda tidak berasal dari Padang");
        //endif
        
    }
    
}
