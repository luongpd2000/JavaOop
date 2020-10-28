/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTap2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        String color =  scanner.nextLine();
        
        Rectange rectange = new Rectange(width, height, color);
        
        System.out.println(rectange +"\nDiện tích : "+ rectange.findArea() +"\nChu vi : "+ rectange.findPerimeter());
        
    }
}
