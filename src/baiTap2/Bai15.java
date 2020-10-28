/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTap2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Bai15 {

    public static List<SinhVien> docFile(String file) throws IOException {
        List<SinhVien> list = new ArrayList<>();
        Scanner scanner = new Scanner(new File(file));
        while (scanner.hasNextLine()) {
            try {
                String ma = scanner.nextLine();
                String ten = scanner.nextLine();
                String lop = scanner.nextLine();
                String dtb = scanner.nextLine();
                SinhVien sinhVien = new SinhVien();
                if (sinhVien.check(ma, ten, lop, dtb)) {
                    list.add(sinhVien);
                }
            } catch (Exception e) {
                //System.out.println(e);
            }

        }
        return list;
    }

    public static void ghiFile(String file, List<SinhVien> list) throws IOException {
        PrintWriter printWriter = new PrintWriter(new File(file));

        for (SinhVien sinhVien : list) {
            try {
                printWriter.write(sinhVien.hien());
                printWriter.write("\n");
            } catch (Exception e) {
            }
        }

        printWriter.close();
    }

    public static void main(String[] args) throws IOException {
        String file = "SV.INP";
        String fileOut = "SX.OUT";
        String fileOut1 = "XEPLOAI.OUT";
        
        List<SinhVien> list = docFile(file);
        System.out.println("Danh sách sinh viên đọc từ file : ");
        for (SinhVien sinhVien : list) {
            System.out.println(sinhVien.hien());
        }

        list = SapXepSinhVien.sapXepTheoLopVaDiem(list);
        System.out.println();
        System.out.println("Danh sách sinh viên sắp xếp theo lớp và điểm giảm dần : ");
        for (SinhVien sinhVien : list) {
            System.out.println(sinhVien.hien());
        }
        ghiFile(fileOut, list);

        list = SapXepSinhVien.phanLoaiTheoDiemVaSapXepTen(list);
        System.out.println();
        System.out.println("Danh sách sinh viên phân loại theo điểm cà tên được sắp xêp : ");
        for (SinhVien sinhVien : list) {
            System.out.println(sinhVien.hien());
        }
        ghiFile(fileOut1, list);
    }
}
