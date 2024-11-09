/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thi;

/**
 *
 * @author HNS
 */
public class Model {
    private int maKH;
    private double hocphi;
    private int thoiLuong;
    private String ghichu;

    public Model() {
    }

    public Model(double hocphi, int thoiLuong, String ghichu) {
        this.hocphi = hocphi;
        this.thoiLuong = thoiLuong;
        this.ghichu = ghichu;
    }

    public Model(int maKH, double hocphi, int thoiLuong, String ghichu) {
        this.maKH = maKH;
        this.hocphi = hocphi;
        this.thoiLuong = thoiLuong;
        this.ghichu = ghichu;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public double getHocphi() {
        return hocphi;
    }

    public void setHocphi(double hocphi) {
        this.hocphi = hocphi;
    }

    public int getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    
    public Object[] todataRow(){
        return new Object[]{this.getMaKH(),this.getHocphi(),this.getThoiLuong(),this.getGhichu()};
    }
}
