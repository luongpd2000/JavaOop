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
public class Bai5 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n= scanner.nextInt();
        StackOfIntergers stackOfIntergers = new StackOfIntergers(n);
        for (int i = 2; i <=n; i++) {
            while(n%i==0){
                stackOfIntergers.push(i);
                n/=i;
            }
        }

        
        while(stackOfIntergers.getSize()!=0){
            System.out.println(stackOfIntergers.pop());
        }
    }
 
}
