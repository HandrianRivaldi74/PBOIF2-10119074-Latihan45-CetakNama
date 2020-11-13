/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if2.pkg10119074.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
 * @author Acer
 * Nama      : HANDRIAN RIVALDI
 * Kelas     : PBOIF2
 * NIM       : 10119074
 * Deskrifsi : 
 */
public class IF210119074Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Printer cetakNama = new Printer();
        
        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukkan nama anda : ");
        String inputNama = "";
        inputNama+=scanner.nextLine();
        cetakNama.setNama(inputNama);
        String nama = cetakNama.getNama();
        
        System.out.print("Mau cetak nama berapa kali? : ");
        cetakNama.setJmlCetak(scanner.nextInt());
        int jmlCetak = cetakNama.getJmlCetak();
        scanner.close();
        
        cetakNama.cetak(nama);
        cetakNama.cetak(jmlCetak, nama);
    
    
    }
    
}
