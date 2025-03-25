/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan.pkg401;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 * Hari/Tanggal Selasa, 25 Maret 2025
 */
public class Pertemuan401 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String[] nama = new String[6];
        
        for(int z = 0; z<6; z++){
            System.out.print("Input Nama: ");
            nama[z] = inp.nextLine();
        }
        
        /**nama[1] = "Cale Henituse";
        nama[2] = "Sung Jin-Woo";
        nama[3] = "Yu Ijin";
        nama[4] = "Hachi";
        nama[5] = "Ichi";*/
        
        /** Menampilkan semua data dalam array
         * System.out.println("Data ke-1: "nama[0]);
         */
        
        /**for (int i = 0; i < nama.length; i++) {
            System.out.println("Data ke-" + (i + 1) + ": " + nama[i]);
        }
        
        for(String x : nama){
            System.out.println(x);
        }*/
    }
    
}
