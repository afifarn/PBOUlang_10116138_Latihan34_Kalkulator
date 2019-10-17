/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBOUlang_10116138_Latihan34_Kalkulator;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Afif Raditya Nugraha
 * KELAS    : PBO_ULANG/IF4
 * NIM      : 10116138
 * LOG      : Program ini berisi program untuk Menampilkan Kalkulator
 * NoRunning
 */
public class Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner scanner = new Scanner(System.in);
        
        kalkulatorr myKalkulator = new kalkulatorr();
        
        System.out.println("=== Aplikasi Kalkulator Bilangan ===");
        System.out.print("Masukkan Angka ke-1 : ");
        myKalkulator.value1 = scanner.nextDouble();
                
        System.out.print("Masukkan Angka ke-2 : ");
        myKalkulator.value2 = scanner.nextDouble();
        
        System.out.print("");
        
        System.out.println("Hasil Pertambahan : " + 
                myKalkulator.tambahBilangan());
        System.out.println("Hasil Pengurangan : " + 
                myKalkulator.kurangBilangan());
        System.out.println("Hasil Perkalian : " + 
                myKalkulator.kaliBilangan());
        System.out.println("Hasil Pembagian : " + 
                myKalkulator.bagiBilangan());
        System.out.println("Hasil Sisa : " + 
                myKalkulator.sisaBilangan());
        
    }
    
    
}
