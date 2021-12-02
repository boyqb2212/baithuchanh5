/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1.th5;

import java.util.Scanner;

/**
 *
 * @author boyqb2212
 */
public class NhanSu extends Nguoi{
    String maNhanSu;
    double heSoChucVu;
    double heSoLuong;

    public NhanSu() {
    }

    public NhanSu(String maNhanSu, double heSoChucVu, double heSoLuong) {
        this.maNhanSu = maNhanSu;
        this.heSoChucVu = heSoChucVu;
        this.heSoLuong = heSoLuong;
    }

    public NhanSu(String maNhanSu, double heSoChucVu, double heSoLuong, String hoTen, String diaChi, int namSinh) {
        super(hoTen, diaChi, namSinh);
        this.maNhanSu = maNhanSu;
        this.heSoChucVu = heSoChucVu;
        this.heSoLuong = heSoLuong;
    }

    public String getMaNhanSu() {
        return maNhanSu;
    }

    public void setMaNhanSu(String maNhanSu) {
        this.maNhanSu = maNhanSu;
    }

    public double getHeSoChucVu() {
        return heSoChucVu;
    }

    public void setHeSoChucVu(double heSoChucVu) {
        this.heSoChucVu = heSoChucVu;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    static int luongCoBan;

    public static void setLuongCoBan(int luongCoBan) {
        NhanSu.luongCoBan = luongCoBan;
    }
    public void nhapTT(){
        super.nhapTT();
        Scanner Input=new Scanner (System.in);
        System.out.println("nhap ma nhan su");
        this.maNhanSu=Input.nextLine();
        System.out.println("nhap he so chuc vu");
        this.heSoChucVu=Input.nextDouble();
        System.out.println("nhap he so luong");
        this.heSoLuong=Input.nextDouble();
    }

    @Override
    public String toString() {
        return "NhanSu{" + "maNhanSu=" + maNhanSu + ", heSoChucVu=" + heSoChucVu + ", heSoLuong=" + heSoLuong + '}';
    }
    public double tinhLuong(){
        return (this.heSoLuong+this.heSoChucVu)*NhanSu.luongCoBan-this.heSoLuong*(NhanSu.luongCoBan*5/100);
    }
}
