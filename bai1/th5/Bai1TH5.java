/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1.th5;

/**
 *
 * @author boyqb2212
 */
public class Bai1TH5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NhanSu s=new NhanSu();
        s.nhapTT();
        System.out.println(s.toString());
        NhanSu.setLuongCoBan(100);
        System.out.println(s.tinhLuong());
    }
    
}
