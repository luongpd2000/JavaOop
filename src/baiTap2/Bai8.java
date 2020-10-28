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
public class Bai8 {
    
    public static int pre(char c){
        if( c == '(') return 0;
        if( c == '+' || c == '-' ) return 1;
        if( c == '*' || c == '/' || c == '%' ) return 2;
        return 0;
    }
    // bien doi trung to thanh hau to
    public static void intopos(String s){
            String ns="";			// chuoi kq
            int l=s.length(); 
            StackOfChar st = new StackOfChar(l);

            for(int i=0;i<l;i++){
                    if(s.charAt(i)>='A'&&s.charAt(i)<='Z') ns+=s.charAt(i);	//chuoi kq , neu la toan hang
                    else if(s.charAt(i)=='(') st.push(s.charAt(i));	
                    else if(s.charAt(i)==')') {
                        while(!st.isEmpty() && st.peak()!='('){	// neu la toan tu thi day vao chuoi kq
                            ns+=st.pop();
                        }
                        if(!st.isEmpty()) st.pop(); // pop '('
                        //neu dau ) o dau thi phai co lenh empty
                    }
                    else{ //neu khong phai ngoac thi la toan tu 
                        while(!st.isEmpty() && pre(s.charAt(i)) <= pre(st.peak()) ){	// so sanh do uu tien cua toan tu
                            ns+=st.pop();
                        }
                        st.push(s.charAt(i));	// push toan tu vao stack
                    }
            }
            while(!st.isEmpty()&&st.peak()!='('){
                ns+=st.pop();
            }
            System.out.println(ns);
    }
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
         intopos(s);
    }
}
