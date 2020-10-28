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
public final class SapXepSinhVien {

    private SapXepSinhVien() {
    }

    public static List<SinhVien> sapxepTheoLop(List<SinhVien> list) {
        Collections.sort(list, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien arg0, SinhVien arg1) {
                return arg0.getLop().compareTo(arg1.getLop());
            }
        });

        return list;
    }

    public static List<SinhVien> sapXepTheoTen(List<SinhVien> list) {
        Collections.sort(list, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                String[] tmp1 = sv1.getTen().trim().split("\\s+");
                String[] tmp2 = sv2.getTen().trim().split("\\s+");
                int n1 = tmp1.length;
                int n2 = tmp2.length;
                if (tmp1[n1 - 1].compareTo(tmp2[n2 - 1]) == 0) {
                    int i = 0;
                    while (tmp1[i].compareTo(tmp2[i]) == 0 && i < n1 - 1 && i < n2 - 1) {
                        i++;
                    }
                    return tmp1[i].compareTo(tmp2[i]);
                }
                return tmp1[n1 - 1].compareTo(tmp2[n2 - 1]);
            }
        });
        return list;
    }

    public static List<SinhVien> sapXepTheoDiem(List<SinhVien> list) {
        Collections.sort(list, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien arg0, SinhVien arg1) {
                return arg0.getDtb()<arg1.getDtb() ? 1 : -1;
            }
        });
        return list;
    }

    public static List<SinhVien> sapXepTheoLopVaDiem(List<SinhVien> list) {
        list = SapXepSinhVien.sapxepTheoLop(list);
        
        List<SinhVien> kq = new ArrayList<>();
        List<SinhVien> flag = new ArrayList<>();
        
        for (int i = 0; i < list.size(); i++) {
            SinhVien sv1 = list.get(i);
            if (i > 0) {
                SinhVien sv = list.get(i - 1);
                if (!sv.getLop().equals(sv1.getLop())) {
                    flag = SapXepSinhVien.sapXepTheoDiem(flag);
                    kq.addAll(flag);
                    flag.removeAll(flag);
                } 
            } 
            flag.add(sv1);
        }

        if (flag.size() != 0) {
            flag = SapXepSinhVien.sapXepTheoDiem(flag);
            kq.addAll(flag);
        }
        return kq;
    }

    public static List<SinhVien> phanLoaiTheoDiemVaSapXepTen(List<SinhVien> list) {
        
        List<SinhVien> gioi= new ArrayList<SinhVien>();
        List<SinhVien> kha= new ArrayList<SinhVien>();
        List<SinhVien> tB= new ArrayList<SinhVien>();
        List<SinhVien> yeu= new ArrayList<SinhVien>();
        for(SinhVien s: list){
            if(s.getDtb()>=8) gioi.add(s);
            else if(s.getDtb()<8&&s.getDtb()>=7) kha.add(s);
            else if(s.getDtb()<7&&s.getDtb()>=5) tB.add(s);
            else yeu.add(s);
        }
        gioi = SapXepSinhVien.sapXepTheoTen(gioi);
        kha = SapXepSinhVien.sapXepTheoTen(kha);
        tB = SapXepSinhVien.sapXepTheoTen(tB);
        yeu = SapXepSinhVien.sapXepTheoTen(yeu);
        
        List<SinhVien> sv= new ArrayList<SinhVien>();
        sv.addAll(gioi);
        sv.addAll(kha);
        sv.addAll(tB);
        sv.addAll(yeu);
        
        return sv;
    }
}
