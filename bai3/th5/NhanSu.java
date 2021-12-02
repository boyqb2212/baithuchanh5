/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3.th5;

import java.util.Scanner;

/**
 *
 * @author boyqb2212
 */
public class NhanSu {
    String hoTen;
    int tuoi;
    int namSinh;
    String ngheNghiep;

    public NhanSu() {
    }

    public NhanSu(String hoTen, int tuoi, int namSinh, String ngheNghiep) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.namSinh = namSinh;
        this.ngheNghiep = ngheNghiep;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }
    public void nhapTT(){
        Scanner Input=new Scanner(System.in);
        System.out.println("Nhap ho ten");
        this.hoTen=Input.nextLine();
        System.out.println("Nhap tuoi");
        this.tuoi=Input.nextInt();
        System.out.println("Nhap nam sinh");
        this.namSinh=Input.nextInt();
        Input.nextLine();
        System.out.println("Nhap nghe nghiep");
        this.ngheNghiep=Input.nextLine();
    }

    @Override
    public String toString() {
        return "NhanSu{" + "hoTen=" + hoTen + ", tuoi=" + tuoi + ", namSinh=" + namSinh + ", ngheNghiep=" + ngheNghiep + '}';
    }
    
}
