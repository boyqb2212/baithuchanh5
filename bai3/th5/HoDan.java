/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3.th5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author boyqb2212
 */
public class HoDan {
    int soNguoi;
    String soNha;
    ArrayList<NhanSu> tthgd;

    public HoDan() {
    }

    public HoDan(int soNguoi, String soNha, ArrayList<NhanSu> tthgd) {
        this.soNguoi = soNguoi;
        this.soNha = soNha;
        this.tthgd = tthgd;
    }

    public int getSoNguoi() {
        return soNguoi;
    }

    public void setSoNguoi(int soNguoi) {
        this.soNguoi = soNguoi;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public ArrayList<NhanSu> getTthgd() {
        return tthgd;
    }

    public void setTthgd(ArrayList<NhanSu> tthgd) {
        this.tthgd = tthgd;
    }
    
    public void nhapTT(){
        this.tthgd =new ArrayList<>();
        Scanner Input=new Scanner (System.in);
        System.out.println("Nhap so nguoi");
        this.soNguoi=Input.nextInt();
        Input.nextLine();
        System.out.println("Nhap so nha");
        this.soNha=Input.nextLine();
        System.out.println("Nhap thong tin tung thanh vien trong gia dinh");
        for(int i=0;i<this.soNguoi;i++){
            NhanSu s=new NhanSu();
            s.nhapTT();
            this.tthgd.add(s);
        }
    }

    @Override
    public String toString() {
        return "HoDan{" + "soNguoi=" + soNguoi + ", soNha=" + soNha + ", tthgd=" + tthgd + '}';
    }
    
}
