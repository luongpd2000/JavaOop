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
public class MatHang {
    private int maHang;
    private String ten;
    private String nhom;
    private double giaBan;

    public MatHang() {
    }

    public MatHang(int maHang, String ten, String nhom, double giaBan) {
        this.maHang = maHang;
        this.ten = ten;
        this.nhom = nhom;
        this.giaBan = giaBan;
    }

    public int getMaHang() {
        return maHang;
    }

    public String getTen() {
        return ten;
    }

    public String getNhom() {
        return nhom;
    }

    public double getGiaBan() {
        return giaBan;
    }

    @Override
    public String toString() {
        String ma ="";
        if(maHang<1000){
            int l = 4 - String.valueOf(maHang).length();
            for (int i = 0; i < l; i++) {
                ma +="0";
            }
            ma += String.valueOf(maHang);
            return  ma + " " + ten + " " + nhom + " " + giaBan ;
        }
        return  maHang + " " + ten + " " + nhom + " " + giaBan ;
    }
    
    
    
    public boolean check(String maHang, String ten, String nhom, String giaBan) throws Exception {
        if ( maHang.trim().length()!=4 || Integer.parseInt(maHang)>9999 || Integer.parseInt(maHang)==0) {
            throw new Exception();
        }
        
        if (ten.trim().length() == 0  ) {
            throw new Exception();
        }
        
        if (!nhom.trim().equals("hàng tiêu dùng") && !nhom.trim().equals("hàng thời trang") 
                && !nhom.trim().equals("điện tử - điện lạnh")) {
            throw new Exception();
        }
        if (Double.parseDouble(giaBan) < 0.0f) {
            throw new Exception();
        }
        this.maHang = Integer.parseInt(maHang);
        this.ten = ten;
        this.nhom = nhom;
        this.giaBan = Double.parseDouble(giaBan);
        return true;
    }
}
