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
public final class SapXepMonHoc {
    private SapXepMonHoc(){}
    
    public static List<MonHoc> sapXepMonHocTheoTinGiamDan(List<MonHoc> list){
        Collections.sort(list, new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc arg0, MonHoc arg1) {
                return arg0.getSoTinChi()<arg1.getSoTinChi() ? 1 : -1;
            }
        });
        
        return list;
    }
    
    public static List<MonHoc> sapXepMonHocTheoTen(List<MonHoc> list){
        Collections.sort(list, new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc arg0, MonHoc arg1) {
                return arg0.getTenMon().trim().compareTo(arg1.getTenMon().trim());
            }
        });
        
        return list;
    }
    
    public static List<MonHoc> sapXepMonHocTheoNhomVaTen(List<MonHoc> list){
        List<MonHoc> coBan = new ArrayList<>();
        List<MonHoc> coSoNganh = new ArrayList<>();
        List<MonHoc> chuyenNganh = new ArrayList<>();
        List<MonHoc> kyNangMem = new ArrayList<>();
        
        for (MonHoc monHoc : list) {
            if (monHoc.getNhomMon().trim().equals("Cơ bản")) {
                coBan.add(monHoc);
            }
            if (monHoc.getNhomMon().trim().equals("cơ sở ngàng")) {
                coSoNganh.add(monHoc);
            }
            if (monHoc.getNhomMon().trim().equals("chuyên ngành")) {
                chuyenNganh.add(monHoc);
            }
            if (monHoc.getNhomMon().trim().equals("kỹ năn mềm")) {
                kyNangMem.add(monHoc);
            }
        }

        coBan = SapXepMonHoc.sapXepMonHocTheoTen(coBan);
        coSoNganh = SapXepMonHoc.sapXepMonHocTheoTen(coSoNganh);
        chuyenNganh = SapXepMonHoc.sapXepMonHocTheoTen(chuyenNganh);
        kyNangMem = SapXepMonHoc.sapXepMonHocTheoTen(kyNangMem);
        
        list.removeAll(list);
        list.addAll(coBan);
        list.addAll(coSoNganh);
        list.addAll(chuyenNganh);
        list.addAll(kyNangMem);
        
        return list;
    }
}
