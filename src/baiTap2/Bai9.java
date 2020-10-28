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
public class Bai9 {
    
    public static void doiCoSo(int n,int t){
        StackOfChar stackOfChar = new StackOfChar(t);
        while(t!=0){
            int d = t%n;
            if(d > 9){
                d = d+55;
                System.out.println(d);
                char c = (char)(d);
                stackOfChar.push(c);
            }else{
                char c = (char)(d+'0');
                stackOfChar.push(c);
            }
            t /= n;
        }
        
        while(stackOfChar.getSize()!=0){
            System.out.print(stackOfChar.pop());
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cơ số muốn đổi :");
        int n= scanner.nextInt();
        System.out.println("Nhập số muốn đổi : ");
        int t =scanner.nextInt();
        doiCoSo(n, t);
    }
}
