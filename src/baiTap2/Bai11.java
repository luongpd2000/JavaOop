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
public class Bai11 {
    
    public static boolean can(double a,double b,double c) {
        if(a==b || a==c || b==c){
            return true;
        }
        return false;
    }
    
    public static boolean deu(double a,double b,double c) {
        if(a==b && b==c){
            return true;
        }
        return false;
    }
    
     public static boolean vuong(double a,double b,double c) {
        
        double x = Math.round((Math.pow(a, 2)*10)/10);
        double y = Math.round((Math.pow(b, 2)*10)/10);
        double z = Math.round((Math.pow(c, 2)*10)/10);
        
        if((x==y+z) || (x+y==z) ||(x+z==y)){
            return true;
        }
        return false;
    }
 
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<MyPoint> list = new ArrayList<>();
        int n = 3;
        
        while(n-->0){
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            
            MyPoint mp = new MyPoint(x, y);
            list.add(mp);
        }
        double max=0;
        double distance1 =list.get(0).distance(list.get(1));
        double distance2 =list.get(0).distance(list.get(2));
        double distance3 =list.get(1).distance(list.get(2));
        
        if((distance1+distance2<distance3) || (distance2+distance3<distance1) || (distance1+distance3<distance2)){
            System.out.println("Không tạo thành 1 tam giác");
        }else if(deu(distance1, distance2, distance3)){
                System.out.println("Tam giác đều");
        }else if(vuong(distance1, distance2, distance3) && can(distance1, distance2, distance3) ){
                System.out.println("Tam giác vuông cân");
        }else if(vuong(distance1, distance2, distance3) ){
                System.out.println("Tam giác vuông ");
        }else if(can(distance1, distance2, distance3) ){
                System.out.println("Tam giác cân ");
        }
    }
}
