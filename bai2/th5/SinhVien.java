/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2.th5;

import java.util.Scanner;

/**
 *
 * @author boyqb2212
 */
public class SinhVien extends Nguoi {
    String maSV;
    String tenLop;
    float diem1;
    float diem2;
    float diem3;

    public SinhVien() {
    }

    public SinhVien(String maSV, String tenLop, float diem1, float diem2, float diem3) {
        this.maSV = maSV;
        this.tenLop = tenLop;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public SinhVien(String maSV, String tenLop, float diem1, float diem2, float diem3, String hoTen, String diaChi, int namSinh) {
        super(hoTen, diaChi, namSinh);
        this.maSV = maSV;
        this.tenLop = tenLop;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public float getDiem1() {
        return diem1;
    }

    public void setDiem1(float diem1) {
        this.diem1 = diem1;
    }

    public float getDiem2() {
        return diem2;
    }

    public void setDiem2(float diem2) {
        this.diem2 = diem2;
    }

    public float getDiem3() {
        return diem3;
    }

    public void setDiem3(float diem3) {
        this.diem3 = diem3;
    }
    public void nhapTT(){
        super.nhapTT();
        Scanner Input=new Scanner(System.in);
        System.out.println("Nhap ma sinh vien");
        this.maSV=Input.nextLine();
        System.out.println("Nhap ten lop");
        this.tenLop=Input.nextLine();
        System.out.println("nhap diem 1 ");
        this.diem1=Input.nextFloat();
        System.out.println("nhap diem 2");
        this.diem2=Input.nextFloat();
        System.out.println("nhap diem 3");
        this.diem3=Input.nextFloat();
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSV=" + maSV + ", tenLop=" + tenLop + ", diem1=" + diem1 + ", diem2=" + diem2 + ", diem3=" + diem3 + '}';
    }
    public float diemTB(){
        return (this.diem1+this.diem2+this.diem3)/3;
    }
}
