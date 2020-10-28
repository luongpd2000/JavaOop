/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTap2;

/**
 *
 * @author DELL
 */
public class SinhVien {

    private String maSinhVien;
    private int ma;
    private String ten;
    private String lop;
    private String khoa;
    private double dtb;

    public SinhVien(String maSinhVien, String ten, String lop, String khoa) {
        this.maSinhVien = maSinhVien;
        this.ten = ten;
        this.lop = lop;
        this.khoa = khoa;
    }

    public SinhVien() {
    }

    public SinhVien(int ma, String ten, String lop, double dtb) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.dtb = dtb;
    }

    public int getMa() {
        return ma;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public double getDtb() {
        return dtb;
    }

    public String getTen() {
        return ten;
    }

    public String getLop() {
        return lop;
    }

    public String getKhoa() {
        return khoa;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSinhVien : " + maSinhVien + ", ten : " + ten + ", lop : " + lop + ", khoa : " + khoa + '}';
    }

    public String hien() {
        String ma ="";
        if(this.ma<1000){
            int l = 4 - String.valueOf(this.ma).length();
            for (int i = 0; i < l; i++) {
                ma +="0";
            }
            ma += String.valueOf(this.ma);
            return ma + " " + ten + " " + lop + " " + dtb;
        }
        return this.ma + " " + ten + " " + lop + " " + dtb;
    }

    public boolean check(String ma, String ten, String lop, String dtb) throws Exception {
        if (ma.trim().length()!=4 || Integer.parseInt(ma)>9999 || Integer.parseInt(ma)==0) {
            throw new Exception();
        }
        if (ten.trim().length() == 0 || ten.indexOf(" ") == 0 || ten.indexOf(" ") == ten.length() - 1 || ten.trim().indexOf(" ") == -1) {
            throw new Exception();
        }
        if (!lop.matches("^D\\d{2}CQ\\w{2}\\d{2}[-]B$")) {
            throw new Exception();
        }
        if (Double.parseDouble(dtb) > 10.0f || Double.parseDouble(dtb) < 0.0f) {
            throw new Exception();
        }
        this.ma = Integer.parseInt(ma);
        this.ten = ten;
        this.lop = lop;
        this.dtb = Double.parseDouble(dtb);
        return true;
    }

}
