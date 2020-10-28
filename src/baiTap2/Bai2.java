/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTap2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Bai2 {
    public static void main(String[] args) {
        List<SinhVien> list = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        while(n-->0){
            String maSinhVien = scanner.nextLine();
            String ten = scanner.nextLine();
            String lop = scanner.nextLine();
            String khoa = scanner.nextLine();
            SinhVien sinhVien = new SinhVien(maSinhVien, ten, lop, khoa);
            list.add(sinhVien);
        }
        
//        list.add(new SinhVien("B18DCCN384", "Pham Luong", "D18CQCN10", "2018-2023"));
//        list.add(new SinhVien("B18DCCN385", "My Thanh", "D18CQCN11", "2018-2023"));
//        list.add(new SinhVien("B18DCCN386", "Tran Truong", "D18CQCN09", "2018-2023"));
//        list.add(new SinhVien("B18DCCN387", "Nguyen Duy", "D18CQCN10", "2018-2023"));
//        list.add(new SinhVien("B18DCCN388", "Hoang Toan", "D18CQCN11", "2018-2023"));
//        list.add(new SinhVien("B18DCCN389", "Ngo Son", "D18CQCN11", "2018-2023"));
//        list.add(new SinhVien("B18DCCN390", "Khuat Khanh", "D18CQCN09", "2018-2023"));
//        list.add(new SinhVien("B18DCCN391", "La Tu", "D18CQCN07", "2018-2023"));
//        list.add(new SinhVien("B18DCCN392", "Do Thach", "D18CQCN08", "2018-2023"));
//        list.add(new SinhVien("B18DCCN393", "Phan Tuan", "D18CQCN09", "2018-2023"));
        
        System.out.println("In danh sách Sinh Viên : ");
        for (SinhVien sinhVien : list) {
            System.out.println(sinhVien);
        }
        
        System.out.println("In danh sách sinh viên sắp xếp theo tên : ");
        SapXepSinhVien.sapXepTheoTen(list);
        for (SinhVien sinhVien : list) {
            System.out.println(sinhVien);
        }
        
        System.out.println("In danh sách sinh viên theo lớp : ");
        SapXepSinhVien.sapxepTheoLop(list);
        for (SinhVien sinhVien : list) {
            System.out.println(sinhVien);
        }
    }
}
