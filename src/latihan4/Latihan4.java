/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

/**
 *
 * @author dwisr
 * NAMA      : RISKI DWI SABARIYANTO
 * KELAS     : IF -1 
 * NIM       : 10118026
 * Deskripsi : Program untuk belajar variabel lokal
 * 
 */
public class Latihan4 {

    public void tambahKambing(){
        //deklarasi variabel lokal
        int jumlahkambing = 0;
        
        jumlahkambing = jumlahkambing +5;
        System.out.println("jumlah kambing setelah ditambah :" + jumlahkambing);
    }
    public static void main(String[] args) {
        Latihan4 kambingJantan = new Latihan4();
        kambingJantan.tambahKambing();
    }
    
}
