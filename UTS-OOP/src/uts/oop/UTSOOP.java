/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts.oop;
import java.util.Scanner;
/**
 *
 * @author 2201010631 Kadek William Darmawan 11 Mei 2024
 */
public class UTSOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dtIN = new Scanner(System.in);
        isiArray[] listBuku = new isiArray[5];
        int no = 0;
        
        int list;
        do {
            System.out.println("Data Buku");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Ubah Buku");
            System.out.println("4. Hapus Buku");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu : ");
            
            list = dtIN.nextInt();
            dtIN.nextLine();
            
            switch (list) {
                case 1:
                    System.out.println("Masukan Data Buku :");
                    System.out.print("Judul     : ");
                    String judul = dtIN.nextLine();
                    System.out.print("Genre     : ");
                    String genre = dtIN.nextLine();
                    System.out.print("Tahun     : ");
                    String tahun = dtIN.nextLine();
                    System.out.print("Penerbit  : ");
                    String penerbit = dtIN.nextLine();
                    
                    isiArray Buku = new isiArray(judul, genre, tahun, penerbit);
                    listBuku[no] = Buku;
                    no++;
                    System.out.println("Buku Berhasil Ditambahkan");
                    break;
                    
                case 2:
                    if (no == 0) {
                        System.out.println("List Buku Kosong!");
                    } else {
                        System.out.println("Daftar Buku : ");
                        for (int i = 0; i < no; i++) {
                            System.out.print("Buku ke-" + (i + 1));
                            System.out.println(listBuku[i]);
                        }
                    }
                    break;
                
                case 3:
                    System.out.println("Masukan Data Buku yang Ingin Diubah!");
                    int idx = dtIN.nextInt();
                    dtIN.nextLine();
                    if (no == 0) {
                        System.out.println("List Buku Kosong!");
                    } else {
                        System.out.println("Masukan Index Buku Yang Ingin Diubah!");
                    if (idx < 1 || idx > no) {
                        System.out.println("\nNomor buku tidak valid!");
                    } else {
                        System.out.println("Ubah Buku");
                        System.out.print("Judul     : ");
                        judul = dtIN.nextLine();
                        System.out.print("Genre     : ");
                        genre = dtIN.nextLine();
                        System.out.print("Tahun     : ");
                        tahun = dtIN.nextLine();
                        System.out.print("Penerbit  : ");
                        penerbit = dtIN.nextLine();

                        listBuku[idx - 1].setJudul(judul);
                        listBuku[idx - 1].setGenre(genre);
                        listBuku[idx - 1].setTahun(tahun);
                        listBuku[idx - 1].setPenerbit(penerbit);
                        
                        System.out.println("\nData buku berhasil diubah!\n");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Masukan Data Buku yang Ingin Dihapus");
                    int hidx = dtIN.nextInt();
                        if (hidx < 1 || hidx > no) {
                        System.out.println("\nNomor buku tidak valid!");
                        } else {
                           for (int i = hidx - 1; i < no - 1; i++) {
                               listBuku[i] = listBuku[i + 1];
                           }
                        }
                        no--;
                        System.out.println("\nBuku berhasil dihapus!");
                        break;
                
                case 0:
                    System.out.println("Aplikasi Ditutup!");
                    break;
                    
                default:
                    System.out.println("Menu Tidak Ada!");
                    break;
                } 
        }while (list != 0);
        dtIN.close();  
    }
    
}
