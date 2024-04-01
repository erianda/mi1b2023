/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan1;

import java.util.Scanner;

/**
 *
 * @author erianda
 */
public class Komparasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String username = "budi";
        String password = "12345";

        String userInput, passInput;

        Scanner usernameTxt = new Scanner(System.in);
        System.out.print("Masukan Username : ");
        userInput = usernameTxt.next();
        if (userInput.length() < 3) {
            System.out.println("Username terlalu pendek");
            
            System.out.print("Masukan  Kembali Username anda : ");
            userInput = usernameTxt.next();
        } 
      
        System.out.print("Masukan Password : ");
        passInput = usernameTxt.next();

        if (username.equals(userInput) && password.equals(passInput)) {
            System.out.println("ANDA TERVALIDASI, MENGARAHKAN KE HALAMAN DASHBOARD  ");
        } else {
            System.out.println("Username atau Password tidak tepat");
        }

        String panjangNama = "Lisa Ibrahim";
        System.out.println("Panjang \t : " + panjangNama.length() + " karakter");
        System.out.println("Potong \t\t : " + panjangNama.substring(0, 6));
        System.out.println("Upper case \t : " + panjangNama.toUpperCase());
        System.out.println("Lower case \t : " + panjangNama.toLowerCase());

        String name = null;
        System.out.println("My name is " + name);

        String jurusan, prodi, kelas;
        jurusan = "TI";
        prodi = "MI";
        kelas = username;

        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1.compareTo(s2));
        
        
        String s3 = "the movie";
        System.out.println(s3.indexOf("the"));
        

    }

}
