/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117109_latihan37_objectorientedprogramrata.ratanilai;

import java.util.Scanner;

/**
 * Nama  : Stefanus Saputra
 * NIM   : 10117109
 * Kelas : IF 3
 * Deskripsi : Menampilkan rata rata nilai yang inputannya berasal dari 
 * user dengan konsep oop
 */
public class PBO3_10117109_Latihan37_ObjectOrientedProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NilaiMahasiswa mhs = new NilaiMahasiswa();
         Scanner scn = new Scanner(System.in);

         int n;
         System.out.print("Masukkan Banyaknya Mahasiswa : ");
         n = scn.nextInt();

         mhs.hitungTotal(mhs.nilaiMhs, n);
         mhs.hitungRataRataNilaiMhs(mhs.totalNilaiMhs, n);

        System.out.println("\nMaka, Rata-rata Nilainya adalah : "
                +mhs.hitungRataRataNilaiMhs(mhs.totalNilaiMhs,n));
       
    }
    
}
