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
public final class SapXepSach {

    private SapXepSach() {

    }

    public static List<Sach> sapXepTheoGiaGiamDan(List<Sach> list) {
        Collections.sort(list, new Comparator<Sach>() {
            @Override
            public int compare(Sach arg0, Sach arg1) {
                return arg0.getGiaBan() < arg1.getGiaBan() ? 1 : -1;
            }
        });

        return list;
    }

    public static List<Sach> sapXepTheoTen(List<Sach> list) {
        Collections.sort(list, new Comparator<Sach>() {
            @Override
            public int compare(Sach arg0, Sach arg1) {
                return arg0.getTenSach().trim().compareTo(arg1.getTenSach().trim());
            }
        });

        return list;
    }

    public static List<Sach> sapXepTheoChuyenNganhVaTenSach(List<Sach> list) {

        Collections.sort(list, new Comparator<Sach>() {
            @Override
            public int compare(Sach arg0, Sach arg1) {
                return arg0.getChuyenNganh().trim().compareTo(arg1.getChuyenNganh().trim());
            }
        });

        List<Sach> kq = new ArrayList<>();
        List<Sach> flag = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            Sach sach = list.get(i);
            if (i > 0) {
                Sach sach1 = list.get(i - 1);
                if (!sach.getChuyenNganh().equals(sach1.getChuyenNganh())) {
                    flag = SapXepSach.sapXepTheoTen(flag);
                    kq.addAll(flag);
                    flag.removeAll(flag);
                }
            }
            flag.add(sach);
        }

        if (flag.size() != 0) {
            flag = SapXepSach.sapXepTheoTen(flag);
            kq.addAll(flag);
        }
        return list;
    }
}
