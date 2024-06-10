/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.oop;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class isiArray {
    private String judul;
    private String genre;
    private String tahun;
    private String penerbit;
    Scanner dtIN = new Scanner(System.in);
    
    public isiArray(String judul, String genre, String tahun, String penerbit){
        this.judul = judul;
        this.genre = genre;
        this.tahun = tahun;
        this.penerbit = penerbit;
    }
    
    public isiArray(String judul, String genre) {
        this.judul = judul;
        this.genre = genre;
    }
    
    @Override
    public String toString() {
        return " [ Judul = " + judul + ", Genre = " + genre + ", Tahun = " + tahun + ", Penerbit = " + penerbit;
    }
    
    public void setJudul(String judul) {
        this.judul = judul;
    }
    
    public String getJudul() {
        return judul;
    }
    
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public String getGenre() {
        return genre;
    }
    
    public void setTahun(String tahun) {
        this.tahun = tahun;
    }
    
    public String getTahun() {
        return tahun;
    }
    
    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }
    
    public String getPenerbit() {
        return penerbit;
    }
    
}
