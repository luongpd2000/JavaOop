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
public class Bai6 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        int n= scanner.nextInt();
        StackOfIntergers stackOfIntergers = new StackOfIntergers(n);
        
        while(n!=0){
            stackOfIntergers.push(n%2);
            n /= 2;
        }
        
        while(stackOfIntergers.getSize()!=0){
            System.out.print(stackOfIntergers.pop());
        }
        System.out.println();
    }
}
