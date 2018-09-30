/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan27.hurufbesarkecil;
import java.util.Scanner;
/**
 *
 * @author lenovo
 */
public class PBO310117122Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Kalimat : ");
        String huruf = scanner.nextLine();

        String besar = huruf.toUpperCase();
        String kecil = huruf.toLowerCase();

        System.out.println();
        System.out.println("======Hasil Formating======");
        System.out.println("Huruf Besar : " + besar);
        System.out.println("Huruf Besar : " + kecil);
    }
    
}
