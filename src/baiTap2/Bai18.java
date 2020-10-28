/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTap2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Bai18 {
    public static List<MonHoc> docFile(String file) throws IOException {
        List<MonHoc> list = new ArrayList<>();
        Scanner scanner = new Scanner(new File(file));
        while (scanner.hasNextLine()) {
            try {
                String maMon = scanner.nextLine();
                //System.out.println(maHang);
                String ten = scanner.nextLine();
                //System.out.println(ten);
                String nhom = scanner.nextLine();
                //System.out.println(nhom);
                String soTinChi = scanner.nextLine();
                //System.out.println(giaBan);
                MonHoc monHoc = new MonHoc();
                if (monHoc.check(maMon, ten, nhom, soTinChi)) {
                    list.add(monHoc);
                }
            } catch (Exception e) {
                //e.printStackTrace();
            }

        }
        return list;
    }

    public static void ghiFile(String file, List<MonHoc> list) throws IOException {
        PrintWriter printWriter = new PrintWriter(new File(file));

        for (MonHoc monHoc : list) {
            try {
                printWriter.write(monHoc.toString());
                printWriter.write("\n");
            } catch (Exception e) {
            }
        }

        printWriter.close();
    }

    public static void main(String[] args) throws IOException {
        List<MonHoc> list = new ArrayList<>();
        String fileIn = "MONHOC.INP";
        String fileOut = "SXMONHOC.OUT";
        String fileOut1 = "NHOMMONHOC.OUT";
        
        list = docFile(fileIn);
        System.out.println("Danh sách môn học : ");
        for (MonHoc monHoc : list) {
            System.out.println(monHoc.toString());
        }
        System.out.println();
        
        list = SapXepMonHoc.sapXepMonHocTheoTinGiamDan(list);
        ghiFile(fileOut,list);
        System.out.println("Danh sách theo tín chỉ giảm dần : ");
        for (MonHoc monHoc : list) {
            System.out.println(monHoc.toString());
        }
        System.out.println();
        
        list = SapXepMonHoc.sapXepMonHocTheoTen(list);
        ghiFile(fileOut1, list);
        System.out.println("Danh sách môn học theo nhóm và tên đã được sắp xếp : ");
        for (MonHoc monHoc : list) {
            System.out.println(monHoc.toString());
        }
        
    }
}
