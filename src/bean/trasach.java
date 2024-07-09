/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author Hi-XV
 */
public class trasach {
    private int madocgia;
    private int masach;
    private String ngaymuon;
    private String ngayhentra;
    private String ngaytra;
    private int soluongmuon;
    private float trehan;
    private float tien ;
    
    public trasach() {
    }
 
    public trasach(int madocgia, int masach, String ngaymuon, String ngayhentra, String ngaytra, int soluongmuon, float trehan, float tien) {
        this.madocgia = madocgia;
        this.masach = masach;
        this.ngaymuon = ngaymuon;
        this.ngayhentra = ngayhentra;
        this.ngaytra = ngaytra;
        this.soluongmuon = soluongmuon;
        this.trehan = trehan;
        this.tien = tien;
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

    public String getNgaymuon() {
        return ngaymuon;
    }

    public void setNgaymuon(String ngaymuon) {
        this.ngaymuon = ngaymuon;
    }

    public String getNgayhentra() {
        return ngayhentra;
    }

    public void setNgayhentra(String ngayhentra) {
        this.ngayhentra = ngayhentra;
    }

    public String getNgaytra() {
        return ngaytra;
    }

    public void setNgaytra(String ngaytra) {
        this.ngaytra = ngaytra;
    }

    public int getSoluongmuon() {
        return soluongmuon;
    }

    public void setSoluongmuon(int soluongmuon) {
        this.soluongmuon = soluongmuon;
    }

    public float getTrehan() {
        return trehan;
    }

    public void setTrehan(float trehan) {
        this.trehan = trehan;
    }

    public float getTien() {
        return tien;
    }

    public void setTien(float tien) {
        this.tien = tien;
    }

   

    @Override
    public String toString() {
        return "trasach{" + "madocgia=" + madocgia + ", masach=" + masach + ", ngaymuon=" + ngaymuon + ", ngayhentra=" + ngayhentra + ", ngaytra=" + ngaytra + ", soluongmuon=" + soluongmuon + ", trehan=" + trehan + ", tien=" + tien + '}';
    }

}