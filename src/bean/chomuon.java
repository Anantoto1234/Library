/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.util.Date;

/**
 *
 * @author Hi-XV
 */
public class chomuon {
    private int madocgia;
    private int masach;
    private int soluongmuon;
    private String ngaymuon;
    private String ngaytra;

    public chomuon() {
    }

    public chomuon(int madocgia, int masach, int soluongmuon, String ngaymuon, String ngaytra) {
        this.madocgia = madocgia;
        this.masach = masach;
        this.soluongmuon = soluongmuon;
        this.ngaymuon = ngaymuon;
        this.ngaytra = ngaytra;
    }

    public int getMadocgia() {
        return madocgia;
    }

    public void setMadocgia(int madocgia) {
        this.madocgia = madocgia;
    }

    public int getMasach() {
        return masach;
    }

    public void setMasach(int masach) {
        this.masach = masach;
    }

    public int getSoluongmuon() {
        return soluongmuon;
    }

    public void setSoluongmuon(int soluongmuon) {
        this.soluongmuon = soluongmuon;
    }

    public String getNgaymuon() {
        return ngaymuon;
    }

    public void setNgaymuon(String ngaymuon) {
        this.ngaymuon = ngaymuon;
    }

    public String getNgaytra() {
        return ngaytra;
    }

    public void setNgaytra(String ngaytra) {
        this.ngaytra = ngaytra;
    }

    @Override
    public String toString() {
        return "chomuon{" + "madocgia=" + madocgia + ", masach=" + masach + ", soluongmuon=" + soluongmuon + ", ngaymuon=" + ngaymuon + ", ngaytra=" + ngaytra + '}';
    }

    
}
