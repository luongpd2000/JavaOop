/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTap2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Bai13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhập phân số thứ 1 :"+"\nTử số");
        int tu1 = scanner.nextInt();
        System.out.println("Mẫu số");
        int mau1 = scanner.nextInt();
        PhanSo p1 = new PhanSo(tu1,mau1);
        
         System.out.println("Nhập phân số thứ 2 :"+"\nTử số");
        int tu2 = scanner.nextInt();
        System.out.println("Mẫu số");
        int mau2 = scanner.nextInt();
        PhanSo p2 = new PhanSo(tu2,mau2);
        
        System.out.println("Tổng 2 phân số : ");
        p1.congPhanSo(p2).hien();
        
        System.out.println("Hiệu 2 phân số : ");
        p1.truPhanSo(p2).hien();
        
        System.out.println("Tích 2 phân số : ");
        p1.nhanPhanSo(p2).hien();
        
        System.out.println("Thương 2 phân số : ");
        p1.chiaPhanSo(p2).hien();
        
        System.out.println("Phân số tối giản : "+"\nPhân số 1 :");
        p1.toiGian().hien();
        System.out.println("Phân số 2 :");
        p2.toiGian().hien();
        
        if(p1.bangNhau(p2)){
            System.out.println("2 phân số bằng nhau");
        }else if(p1.lonHon(p2)){
            System.out.println("Phân số 1 lớn hơn phân số 2");
        }else{
            System.out.println("Phân số 1 nhỏ hơn phân số 2");
        }
    }
}
