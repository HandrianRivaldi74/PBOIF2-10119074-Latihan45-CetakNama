/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if2.pkg10119074.latihan45.cetaknama;

/**
 *
 * @author Acer
 * Nama      : HANDRIAN RIVALDI
 * Kelas     : PBOIF2
 * NIM       : 10119074
 * Deskrifsi : 
 */
public class Printer {
    private int jmlCetak;
    private String nama;
    
    public int getJmlCetak() {
        return this.jmlCetak;
    }
    
    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
    }
    
    public String getNama() {
        return this.nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void cetak(String nama) {
        System.out.println("Nama anda : " + nama);
    }
    
    public void cetak(int jmlCetak, String nama) {
        System.out.println("Hasil Cetak");
        for (int i = 1; i <= jmlCetak; i++) {
            System.out.println(i + ". " + nama);
        }
    }
    
}
