/* NAMA:NATYA KIVANY
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratikum060325;
import java.util.Scanner;
/**
 *
 * @author LAB-MM
 */
public class PengulanganFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int i,n;
        ///Pengulangan for
        System.out.print("Masukkan batasan angka = ");
        n=in.nextInt();
        System.out.print("--Menggunakan skema For--");
        for(i=1;1<=n;i++)
            System.out.print(i+"\t");
        //endfor
        System.out.println();//ganti baris
        
        System.out.println ("--Menggunkan Skema While--");
        i=1;
        while(i<=n){
            System.out.print(i+"\t");
            i++;
        }
        System.out.println();
        
        System.out.println("--Menggunakan Skema do While--");
        i=1;
        do{
            System.out.print(i+"\t");
            i++;
        }while(i<=n);
    }
}
        
        
      
       
