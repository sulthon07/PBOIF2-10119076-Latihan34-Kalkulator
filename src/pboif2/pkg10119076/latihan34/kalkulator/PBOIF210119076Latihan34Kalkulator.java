/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119076.latihan34.kalkulator;
import java.util.Scanner;
/**
 *
 * @author ACER
 * Nama : Sulthon Naufal Akmal
 * Kelas : IF2
 * NIM : 10119076
 * Deskripsi : Kalkulator
 */
public class PBOIF210119076Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        Kalkulator hitung = new Kalkulator ();
        System.out.println("=====Aplikasi Kalkulator Bilangan=====");
        
        System.out.print("Masukkan Angka Ke-1 : ");
        hitung.value1 = keyboard.nextDouble();
        
        System.out.print("Masukkan Angka Ke-2 : ");
        hitung.value2 = keyboard.nextDouble();
        
        System.out.println();
        System.out.println("Hasil Pertambahan :" +hitung.tambahBilangan());
        System.out.println("Hasil Pengurangan :" +hitung.kurangBilangan());
        System.out.println("Hasil Perkalian :" +hitung.kaliBilangan());
        System.out.println("Hasil Pembagian :" +hitung.bagiBilangan());
        System.out.println("Hasil Sisa :" +hitung.sisaBilangan());
}
    
}
