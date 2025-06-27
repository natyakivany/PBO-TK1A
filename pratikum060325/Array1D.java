/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratikum060325;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author LAB-MM
 */
public class Array1D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A[]; //deklarasi array
        int i,uk; //i=indeks,uk=ukuran
        Scanner in=new Scanner(System.in);
        Random rand = new Random();//buat objek random
        System.out.print("Masukkan ukuran array = ");
        uk=in.nextInt();
        A=new int[uk];
        //mengisi 
        for(i=0;i<uk;i++){
            A[i]=rand.nextInt(100)+1;//isi array dengan rand
           System.out.print("Masukkan data ke "+(i+1)+" = ");
           A[i]=in.nextInt();//berikan ukuran untuk array
        }
        //Menampilkan array
        System.out.println("---Isi Array---");
        for(i=0;i<uk;i++)
            System.out.print(A[i]+"\t");
        //endfor
        System.out.println();
        
        //menghitung jumlah array
        int total=0;//karena penjumlahan 0 tidak mengubah 
        for(i=0;i<uk;i++)
           total= total + A[i];
         //endfor
        float rata = (float)total/uk;
        System.out.println("Jumlah = "+total);
        System.out.println("Rata-rata = "+rata);
        
        //cara1, berdasarkan isi array
        int max = A[0];
        for(i=1;i<uk;i++)
        {
            if(A[i]>max)
            max = A[i];
            //endif
        }
        System.out.println("Nilai maksimum array = " + max);
        //cara2, brerdasarkan posisi(indeks) nilai terbesar
        int imax= 0;
        for(i=1;i<uk;i++)
        {
            if(A[i]>A[imax])
            imax =i;
            //endif
        }
        System.out.println("Nilai maksimum array = " +imax);
         
        //cara1
        int min = A[0];
        for(i=1;i<uk;i++)
        {
            if(A[i] < min) 
            min = A[i];
            //dif
        }
     
        System.out.println("Nilai minimum array = " + min);
        //cara2, brerdasarkan posisi(indeks) nilai terkecil
        int imin = 0;
        for(i=1;i<uk;i++)
        {
            if(A[i]>A[imin])
            imin =i;
            //endif
        }
        System.out.println("Nilai minimum =" +imin);
        
    
}
}
