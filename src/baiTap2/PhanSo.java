/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTap2;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author DELL
 */
public class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo( int tuSo,int mauSo) {
        this.mauSo = mauSo;
        this.tuSo = tuSo;
    }
    
    public PhanSo(){
        this.mauSo=1;
        this.tuSo=0;
    }
    
    
    private static int gcd(int a,int b){
        while(a!=b){
            if(a>b) a-=b;
            else{
                b-=a;
            }
        }
        return a;
    }
    
    private static int lcm(int a,int b){
        return a*b/gcd(a,b);
    }
    
    private static List<PhanSo> quyDong(PhanSo a, PhanSo b){
        List<PhanSo> list = new ArrayList<>();
        int tu1 = a.tuSo;
        int mau1 = a.mauSo;
        int tu2 = b.tuSo;
        int mau2 = b.mauSo;
        
        int lcm = lcm(mau1,mau2);
        a.tuSo = (tu1*lcm/mau1);
        b.tuSo =(tu2*lcm/mau2);
        a.mauSo = (lcm);
        b.mauSo = (lcm);
        
        list.add(a);
        list.add(b);
        return list;
    }
    
    
    public PhanSo congPhanSo(PhanSo b){
        List<PhanSo> list = quyDong(this,b);
        
        PhanSo a = list.get(0);
        b = list.get(1);
        
        PhanSo kq  = new PhanSo((a.tuSo + b.tuSo),a.mauSo);
        return kq.toiGian();
    }
    
    
     public  PhanSo truPhanSo( PhanSo b){
        List<PhanSo> list = quyDong(this,b);
        
        PhanSo a = list.get(0);
        b = list.get(1);
        
        PhanSo kq  = new PhanSo((a.tuSo - b.tuSo),a.mauSo);
        return kq.toiGian();
    }
     
    public PhanSo nhanPhanSo( PhanSo b){
        PhanSo kq  = new PhanSo(this.tuSo * b.tuSo,this.mauSo * b.mauSo);
        return kq.toiGian();
    }
    
    public PhanSo chiaPhanSo( PhanSo b){
        PhanSo kq  = new PhanSo(this.tuSo * b.mauSo,this.mauSo * b.tuSo);
        return kq.toiGian();
    }
    
    
    public PhanSo toiGian(){
        int tu = this.tuSo;
        int mau = this.mauSo;
        
        int c = gcd(this.tuSo,this.mauSo);
        tu = tu/c;
        mau = mau/c;
        
        PhanSo phanSo = new PhanSo(tu,mau) ;
        return phanSo;
    }
    
    public PhanSo nghichDao(){
        int tu = this.mauSo;
        int mau = this.tuSo;
        
        PhanSo phanSo = new PhanSo(tu,mau) ;
        return phanSo;
    }
    
    public PhanSo doiDau(){
        int tu = -this.tuSo;
        int mau = this.mauSo;
        
        PhanSo phanSo = new PhanSo(tu,mau) ;
        return phanSo;
    }
    
    
    public boolean bangNhau(PhanSo ps2){
        List<PhanSo> list = quyDong(this,ps2);
        
        PhanSo a = list.get(0);
        ps2 = list.get(1);
        
        return a.tuSo==ps2.mauSo;
    }
    
    public boolean lonHon(PhanSo ps2){
        List<PhanSo> list = quyDong(this,ps2);
        
        PhanSo a = list.get(0);
        ps2 = list.get(1);
        
        return a.tuSo>=ps2.mauSo;
    }
    
    public boolean nhoHon(PhanSo ps2){
        List<PhanSo> list = quyDong(this,ps2);
        
        PhanSo a = list.get(0);
        ps2 = list.get(1);
        
        return a.tuSo<=ps2.mauSo;
    }
    
    public void hien() {
        System.out.println(this.tuSo+"/"+this.mauSo);
    }
    
    public void nhap(String a){
        StringTokenizer st = new StringTokenizer(a,"/");
        this.tuSo = Integer.parseInt(st.nextToken());
        this.mauSo = Integer.parseInt(st.nextToken());
    }
    
}
