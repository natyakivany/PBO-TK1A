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
public class Keyboard extends AlatMusik implements BisaDinyalakan {
    private boolean dayaBersambung;
    
    public Keyboard(String nama, String jenis, boolean dayaBersambung){
        super(nama,jenis);
        this.dayaBersambung = dayaBersambung;
    }

    
    @Override
    public void nyalakan(){
        if(cekListrik()){
            System.out.println(nama+"dinyalakan");
        }else{
            System.out.println(nama+"tidak bisa dinyalakan");
        }
    }
    
    @Override
    public void matikan(){
         System.out.println(nama+"dimatikan");
    }
    
    @Override
    public boolean cekListrik(){
        return dayaBersambung;
    }
    
    @Override
    public void mainkan(){
         System.out.println(nama+"dimainkan dengan menekan tuts");
    }
    
    @Override
    public void stem(){
         System.out.println("keyboard"+nama+"distem secara ");
    }
    
}
