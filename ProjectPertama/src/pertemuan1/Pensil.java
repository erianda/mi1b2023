/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan1;

/**
 *
 * @author erianda
 */
public class Pensil {
     static int harga=1000;//static variable
     
     void merk(){
         String pabrik = "Bekasi"; //local variable
     }
     
     public static void main(String[] args) {
        int jumlah =10; //instance variabel
        int quantity=2;
        String nama = "Aldo";
        String nama2 = "Erianda";
        float jumlahBerkoma = jumlah; 
        String namaLengkap = nama+nama2;
        int hasil = jumlah+quantity;
         System.out.println(namaLengkap);
         System.out.println(hasil);
         System.out.println(jumlah);
         System.out.println(jumlahBerkoma);
    }
    
}
