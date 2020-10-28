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
public class Bai17 {

    public static List<Sach> docFile(String file) throws IOException {
        List<Sach> list = new ArrayList<>();
        Scanner scanner = new Scanner(new File(file));
        while (scanner.hasNextLine()) {
            try {
                String ma = scanner.nextLine();
                String ten = scanner.nextLine();
                String chuyenNganh = scanner.nextLine();
                String giaBan = scanner.nextLine();
                Sach sach = new Sach();
                if (sach.check(ma, ten, chuyenNganh, giaBan)) {
                    list.add(sach);
                }
            } catch (Exception e) {
                //System.out.println(e);
            }

        }
        return list;
    }

    public static void ghiFile(String file, List<Sach> list) throws IOException {
        PrintWriter printWriter = new PrintWriter(new File(file));

        for (Sach sach : list) {
            try {
                printWriter.write(sach.toString());
                printWriter.write("\n");
            } catch (Exception e) {
            }
        }

        printWriter.close();
    }

    public static void main(String[] args) throws IOException {
        String file = "SACH.INP";
        String fileOut = "SXSACH.OUT";
        String fileOut1 = "CN.OUT";

        List<Sach> list = docFile(file);
        System.out.println("Danh sách Sách đọc từ file :");
        for (Sach sach : list) {
            System.out.println(sach.toString());
        }

        list = SapXepSach.sapXepTheoGiaGiamDan(list);
        System.out.println();
        System.out.println("Danh sách Sách sắp xếp theo giá giảm dần :");
        for (Sach sach : list) {
            System.out.println(sach.toString());
        }
        ghiFile(fileOut, list);

        list = SapXepSach.sapXepTheoChuyenNganhVaTenSach(list);
        System.out.println();
        System.out.println("Danh sách Sách xếp theo chuyên ngành và tên : ");
        for (Sach sach : list) {
            System.out.println(sach.toString());
        }
        ghiFile(fileOut1, list);
    }
}
