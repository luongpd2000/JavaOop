/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTap2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author DELL
 */
public final class SapXepMatHang {

    private SapXepMatHang() {

    }

    public static List<MatHang> sapXepTheoGiaBanGiamDan(List<MatHang> list) {

        Collections.sort(list, new Comparator<MatHang>() {
            @Override
            public int compare(MatHang arg0, MatHang arg1) {
                return arg0.getGiaBan() < arg1.getGiaBan() ? 1 : -1;
            }

        });
        return list;
    }

    public static List<MatHang> sapXepTheoTen(List<MatHang> list) {
        Collections.sort(list, new Comparator<MatHang>() {
            @Override
            public int compare(MatHang arg0, MatHang arg1) {
                return arg0.getTen().compareTo(arg1.getTen());
            }
        });
        return list;
    }

    public static List<MatHang> sapXepTheoNhomVaTen(List<MatHang> list) {
        List<MatHang> hangTieuDung = new ArrayList<>();
        List<MatHang> hangThoiTrang = new ArrayList<>();
        List<MatHang> dienTuDienLanh = new ArrayList<>();

        for (MatHang matHang : list) {
            if (matHang.getNhom().trim().equals("hàng tiêu dùng")) {
                hangTieuDung.add(matHang);
            }
            if (matHang.getNhom().trim().equals("hàng thời trang")) {
                hangThoiTrang.add(matHang);
            }
            if (matHang.getNhom().trim().equals("điện tử - điện lạnh")) {
                dienTuDienLanh.add(matHang);
            }
        }

        hangTieuDung = SapXepMatHang.sapXepTheoTen(hangTieuDung);
        hangThoiTrang = SapXepMatHang.sapXepTheoTen(hangThoiTrang);
        dienTuDienLanh = SapXepMatHang.sapXepTheoTen(dienTuDienLanh);
        
        list.removeAll(list);
        list.addAll(hangTieuDung);
        list.addAll(hangThoiTrang);
        list.addAll(dienTuDienLanh);
        
        return list;
    }
}
