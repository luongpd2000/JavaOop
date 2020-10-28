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
public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<MyPoint> list = new ArrayList<>();
        int n = scanner.nextInt();
        
        while(n-->0){
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            
            MyPoint mp = new MyPoint(x, y);
            list.add(mp);
        }
        double max=0;
        int p1 = 0,p2 = 0;
        for (int i = 0; i <list.size()-1; i++) {
            for (int j = 1; j < list.size(); j++) {
                double distance =list.get(i).distance(list.get(j));
                if(i!=j && distance>max){
                    max = distance;
                    p1=i;
                    p2=j;
                }
            }
        }
        
        System.out.println("Khoảng cách lớn nhất : " + max);
        System.out.println("Tọa độ 2 điểm : " + "\n"+list.get(p1).getX()+" "+list.get(p1).getY()
                                              + "\n"+list.get(p2).getX()+" "+list.get(p2).getY());
    }
}
