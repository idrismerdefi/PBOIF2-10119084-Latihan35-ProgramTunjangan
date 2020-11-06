/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119084.latihan35.programtunjangan;
/**
 * @author  
 * Nama  : Muhammad Idris Merdefi
 * Kelas : PBOIF2
 * NIM   : 10119084
 * Deskripsi Program : Program ini berisi program Tunjangan
 **/

import java.util.Scanner;
public class PBOIF210119084Latihan35ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        hitungGaji hitungGaji = new hitungGaji();
        
        System.out.println("===========Program Tunjangan===========");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        hitungGaji.setGaji(scanner.nextDouble());
        
        System.out.print("Status Anda? (Menikah/Belum)\t: ");
        hitungGaji.setStatus(scanner.next());
        
        hitungGaji.tampilHasilPerhitungan();
        
         System.out.println("Developed by : Muhammad Idris Merdefi");
    }
    
}
