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
public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin Sinh viên : ");
        System.out.println("Mã sinh viên : ");
        String ma = scanner.nextLine();
        System.out.println("Tên sinh viên : ");
        String ten = scanner.nextLine();
        System.out.println("Lớp : ");
        String lop = scanner.nextLine();
        System.out.println("Khóa : ");
        String khoa = scanner.nextLine();
        
        SinhVien sinhVien = new SinhVien(ma, ten, lop, khoa);
        System.out.println(sinhVien);
    }   
   
}
