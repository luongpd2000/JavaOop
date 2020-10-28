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
public class Sach {

    private int maSach;
    private String tenSach;
    private String chuyenNganh;
    private double giaBan;

    public Sach() {
    }

    public Sach(int maSach, String tenSach, String chuyenNganh, double giaBan) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.chuyenNganh = chuyenNganh;
        this.giaBan = giaBan;
    }

    public int getMaSach() {
        return maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public double getGiaBan() {
        return giaBan;
    }

    @Override
    public String toString() {
        String ma ="";
        if(this.maSach<1000){
            int l = 4 - String.valueOf(this.maSach).length();
            for (int i = 0; i < l; i++) {
                ma +="0";
            }
            ma += String.valueOf(this.maSach);
            return ma + " " + tenSach + " " + chuyenNganh + " " + giaBan;
        }
        return maSach + " " + tenSach + " " + chuyenNganh + " " + giaBan;
    }

    public boolean check(String ma, String ten, String chuyenNganh, String giaBan) throws Exception {

        if (ma.trim().length()!=4  || Integer.parseInt(ma) ==0 || Integer.parseInt(ma) > 9999) {
            throw new Exception();
        }

        if (ten.trim().length() == 0) {
            throw new Exception();
        }

        if (chuyenNganh.trim().length() == 0) {
            throw new Exception();
        }

        if (Double.parseDouble(giaBan) < 0.0f) {
            throw new Exception();
        }
        
        this.maSach = Integer.parseInt(ma);
        this.tenSach = ten;
        this.chuyenNganh = chuyenNganh;
        this.giaBan = Double.parseDouble(giaBan);

        return true;
    }

}
