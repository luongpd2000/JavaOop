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
public class Bai14 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhập số phức thứ 1 :"+"\nPhần thực");
        int thuc1 = scanner.nextInt();
        System.out.println("Phần ảo");
        int ao1 = scanner.nextInt();
        SoPhuc sp1 = new SoPhuc(thuc1,ao1);
        
        System.out.println("Nhập số phức thứ 1 :"+"\nPhần thực");
        int thuc2 = scanner.nextInt();
        System.out.println("Phần ảo");
        int ao2 = scanner.nextInt();
        SoPhuc sp2 = new SoPhuc(thuc2,ao2);
        
        System.out.println("Tổng 2 số phức : ");
        sp1.cong(sp2).hien();
        
        System.out.println("Hiệu 2 số phức : ");
        sp1.tru(sp2).hien();
        
        System.out.println("Tích 2 số phức : ");
        sp1.nhan(sp2).hien();
        
        System.out.println("Thương 2 số phức : ");
        sp1.chia(sp2).hien();
        
        System.out.println("Nghịch đảo : "+"\nSố phức 1 :");
        sp1.nghichDao().hien();
        System.out.println("Số phức 2 :");
        sp2.nghichDao().hien();
        
        if(sp1.bangNhau(sp2)){
            System.out.println("2 số phức bằng nhau");
        }else if(sp1.lonHon(sp2)){
            System.out.println("Số phức 1 lớn hơn số phức 2");
        }else{
            System.out.println("Số phức 1 nhỏ hơn số phức 2");
        }
    }
}
