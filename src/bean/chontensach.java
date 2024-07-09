/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author Hi-XV
 */
public class chontensach {
    private   String chontensach;
    private  int masach;
    private  int maloai;
    private  int soluong;
    private  int matacgia;

    public chontensach() {
    }

    public chontensach(String chontensach, int masach, int maloai, int soluong, int matacgia) {
        this.chontensach = chontensach;
        this.masach = masach;
        this.maloai = maloai;
        this.soluong = soluong;
        this.matacgia = matacgia;
    }

    public String getChontensach() {
        return chontensach;
    }

    public void setChontensach(String chontensach) {
        this.chontensach = chontensach;
    }

    public int getMasach() {
        return masach;
    }

    public void setMasach(int masach) {
        this.masach = masach;
    }

    public int getMaloai() {
        return maloai;
    }

    public void setMaloai(int maloai) {
        this.maloai = maloai;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getMatacgia() {
        return matacgia;
    }

    public void setMatacgia(int matacgia) {
        this.matacgia = matacgia;
    }
    
}
