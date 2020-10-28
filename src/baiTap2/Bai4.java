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
public class Bai4 {
    
    public static boolean prime(int n){
        if (n==0 || n==1) return false;
        if (n==2) return true;
        int m =(int) Math.sqrt(n);
        for (int i = 2; i <=m; i++) {
            if (n%i==0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        StackOfIntergers stackOfIntergers = new StackOfIntergers(n);
        for (int i = 2; i<=n-1; i++) {
            if(prime(i)){
                stackOfIntergers.push(i);
            }
        }
        
        while(stackOfIntergers.getSize()!=0) {
            System.out.println(stackOfIntergers.pop());
        }
    }
}
