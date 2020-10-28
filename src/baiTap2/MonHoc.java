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
public class MonHoc {
    private int maMon;
    private String tenMon;
    private String nhomMon;
    private int soTinChi;

    public MonHoc() {
    }

    public MonHoc(int maMon, String tenMon, String nhomMon, int soTinChi) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.nhomMon = nhomMon;
        this.soTinChi = soTinChi;
    }

    public int getMaMon() {
        return maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public String getNhomMon() {
        return nhomMon;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    @Override
    public String toString() {
        String ma ="";
        if(this.maMon<1000){
            int l = 4 - String.valueOf(this.maMon).length();
            for (int i = 0; i < l; i++) {
                ma +="0";
            }
            ma += String.valueOf(this.maMon);
            return ma + " " + tenMon + " " + nhomMon + " " + soTinChi;
        }
        return maMon + " " + tenMon + " " + nhomMon + " " + soTinChi;
    }

    public boolean check(String maMon, String tenMon, String nhomMon, String soTinChi) throws Exception {
        if(maMon.trim().length()!=4 || Integer.parseInt(maMon)>9999 || Integer.parseInt(maMon)==0) {
            throw new Exception();
        }
        
        if (tenMon.trim().length() == 0  ) {
            throw new Exception();
        }
        
        if (!nhomMon.trim().equals("Cơ bản") && !nhomMon.trim().equals("chuyên ngành") 
                && !nhomMon.trim().equals("kỹ năng mềm") && !nhomMon.trim().equals("cơ sở ngành")) {
            throw new Exception();
        }
        if (Integer.parseInt(soTinChi) < 0 || Integer.parseInt(soTinChi) >7) {
            throw new Exception();
        }
        this.maMon = Integer.parseInt(maMon);
        this.tenMon = tenMon;
        this.nhomMon = nhomMon;
        this.soTinChi = Integer.parseInt(soTinChi);
        return true;
    }
    
    
}
