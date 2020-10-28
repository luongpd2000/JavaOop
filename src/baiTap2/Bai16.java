/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTap2;

import java.awt.BorderLayout;
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
public class Bai16 {

    public static List<MatHang> docFile(String file) throws IOException {
        List<MatHang> list = new ArrayList<>();
        Scanner scanner = new Scanner(new File(file));
        while (scanner.hasNextLine()) {
            try {
                String maHang = scanner.nextLine();
                //System.out.println(maHang);
                String ten = scanner.nextLine();
                //System.out.println(ten);
                String nhom = scanner.nextLine();
                //System.out.println(nhom);
                String giaBan = scanner.nextLine();
                //System.out.println(giaBan);
                MatHang matHang = new MatHang();
                if (matHang.check(maHang, ten, nhom, giaBan)) {
                    list.add(matHang);
                }
            } catch (Exception e) {
                //e.printStackTrace();
            }

        }
        return list;
    }

    public static void ghiFile(String file, List<MatHang> list) throws IOException {
        PrintWriter printWriter = new PrintWriter(new File(file));

        for (MatHang matHang : list) {
            try {
                printWriter.write(matHang.toString());
                printWriter.write("\n");
            } catch (Exception e) {
            }
        }

        printWriter.close();
    }

    public static void main(String[] args) throws IOException {
        List<MatHang> list = new ArrayList<>();
        String fileIn = "MH.INP";
        String fileOut = "SXMATHANG.OUT";
        String fileOut1 = "NHOMMATHANG.OUT";
        
        list = docFile(fileIn);
        System.out.println("Danh sách mặt hàng đọc từ file :");
        for (MatHang matHang : list) {
            System.out.println(matHang.toString());
        }
        
        System.out.println();
        System.out.println("Danh sách mặt hàng sắp xếp theo giá giảm dần :");
        list = SapXepMatHang.sapXepTheoGiaBanGiamDan(list);
        ghiFile(fileOut,list);
        for (MatHang matHang : list) {
            System.out.println(matHang.toString());
        }
        
        System.out.println();
        System.out.println("Danh sách mặt hàng sắp xếp theo nhóm và tên : ");
        list = SapXepMatHang.sapXepTheoNhomVaTen(list);
        ghiFile(fileOut1, list);
        for (MatHang matHang : list) {
            System.out.println(matHang.toString());
        }
        
    }

}
