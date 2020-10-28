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
public class Matrix {
    private float[][] a;

    public Matrix() {
       this.a = new float[3][3]; 
    }
    
    public Matrix(int rows,int cols) {
        this.a = new float[rows][cols];
    }
    
    public Matrix add(Matrix m){
        Matrix sum = new Matrix(this.a.length,this.a[0].length); 
        if(this.a.length==m.a.length && this.a[0].length==m.a[0].length){
            for (int i = 0; i < this.a.length; i++) {
                for (int j = 0; j < this.a[0].length; j++) {
                    sum.a[i][j] = this.a[i][j] + m.a[i][j];
                }
            }
        }else{
            System.out.println("Không cộng được 2 ma trận này");
        }
        return sum;
    }
    
    public Matrix sub(Matrix m){
        Matrix sum = new Matrix(this.a.length,this.a[0].length); 
        if(this.a.length==m.a.length && this.a[0].length==m.a[0].length){
            for (int i = 0; i < this.a.length; i++) {
                for (int j = 0; j < this.a[0].length; j++) {
                    sum.a[i][j] = this.a[i][j] - m.a[i][j];
                }
            }
        }else{
            System.out.println("Không trừ được 2 ma trận này");
        }
        return sum;
    }
    
    public Matrix neg(){
        Matrix flag = new Matrix(this.a.length,this.a[0].length);
        for (int i = 0; i < this.a.length; i++) {
            for (int j = 0; j < this.a[0].length; j++) {
                flag.a[i][j] =(0-this.a[i][j]) ;
            }
        }
        return flag;
    }
    
    public Matrix transpose(){
        Matrix flag = new Matrix(this.a.length,this.a[0].length);
        for (int i = 0; i < this.a.length; i++) {
            for (int j = 0; j < this.a[0].length; j++) {
                flag.a[i][j] = this.a[i][j] >=0 ? this.a[i][j] : (0-this.a[i][j]) ;
            }
        }
        return flag;
    }
    
    
    public Matrix mul(Matrix m){
        Matrix flag = new Matrix(this.a.length,this.a[0].length);
        
        if(this.a.length==m.a[0].length && this.a[0].length==m.a.length){
            for (int i = 0; i < this.a.length; i++) {
                for (int j = 0; j < this.a.length; j++) {
                    for (int k = 0; k < this.a[0].length; k++) {
                        flag.a[i][j] = this.a[i][k] + m.a[k][j];
                    }
                }
            }
        }
        return flag;
    }
    
    
    
    public void print(){
        for (int i = 0; i < this.a.length; i++) {
            for (int j = 0; j < this.a[0].length; j++) {
                System.out.print(this.a[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public void input(){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < this.a.length; i++) {
            for (int j = 0; j < this.a[0].length; j++) {
                this.a[i][j] = scanner.nextFloat();
            }
        }
    }
    
}
