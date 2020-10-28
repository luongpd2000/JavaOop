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
public class Bai7 {
   private static int pre(char x) {
        if (x == '+' || x == '-') {
            return 1;
        } else if (x == '*' || x == '/') {
            return 2;
        } else {
            return 0;
        }
    }

    private static int tinh(int a, int b, char c) {
        if (c == '-') {
            return a - b;
        } else if (c == '+') {
            return a + b;
        } else if (c == '*') {
            return a * b;
        } else if (c == '/') {
            return a / b;
        }
        return 0;
    }

    public static int tinhGiaTri(String s) {
        int n = s.length();
        StackOfChar stc = new StackOfChar(n);
        
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(tinhGiaTri(s));
    }
}
