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
public class NilaiMahasiswa {
    
    public int nilaiMhs;
    public double totalNilaiMhs;
    Scanner scn = new Scanner(System.in);

    public double hitungTotal(int parNilaiMhs, int parN){
        for (int i=1; i<=parN; i++){
            System.out.print("Nilai Mahasiswa ke-"+i+" : ");
            parNilaiMhs = scn.nextInt();
            totalNilaiMhs += parNilaiMhs;
        }
    return totalNilaiMhs;}

    public double hitungRataRataNilaiMhs(double total, int jmlhMhs) {
        return total/jmlhMhs;
    }
}
