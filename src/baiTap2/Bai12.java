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
public class Bai12 {
    
    public static int menu(){
        System.out.println("1. Tính tổng và hiệu hai ma trận; \n" +
                            "2. Tính tích hai ma trận; \n" +
                            "3. Tìm chuyển vị của một ma trận; \n" +
                            "4. Kết thúc chương trình. ");
        System.out.println("Mời bạn nhập lựa chọn : ");
        int t= new Scanner(System.in).nextInt();
        return t;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int i=1;
        while(i==1){
            int menu = menu();
            
            switch(menu){
                case 1:
                    System.out.println("Mời nhập ma trận 1 :");
                    System.out.println("Nhập số hàng :");
                    int rows1 = scanner.nextInt();
                    System.out.println("Nhập số cột :");
                    int cols1 = scanner.nextInt();
                    Matrix matrix1 = new Matrix(rows1,cols1);
                    System.out.println("Nhập giá trị :");
                    matrix1.input();
                    
                    System.out.println("Mời nhập ma trận 2 :");
                    System.out.println("Nhập số hàng :");
                    int rows2 = scanner.nextInt();
                    System.out.println("Nhập số cột :");
                    int cols2 = scanner.nextInt();
                    Matrix matrix2 = new Matrix(rows2,cols2);
                    System.out.println("Nhập giá trị :");
                    matrix2.input();
                    
                    System.out.println("Tổng hai ma trận : ");
                    matrix1.add(matrix2).print();
                    
                    System.out.println("Hiệu hai ma trận :");
                    matrix1.sub(matrix2).print();
                    break;
                case 2:
                    System.out.println("Mời nhập ma trận 1 :");
                    System.out.println("Nhập số hàng :");
                    int rows3 = scanner.nextInt();
                    System.out.println("Nhập số cột :");
                    int cols3= scanner.nextInt();
                    Matrix matrix3 = new Matrix(rows3,cols3);
                    System.out.println("Nhập giá trị :");
                    matrix3.input();
                    
                    System.out.println("Mời nhập ma trận 2 :");
                    System.out.println("Nhập số hàng :");
                    int rows4 = scanner.nextInt();
                    System.out.println("Nhập số cột :");
                    int cols4 = scanner.nextInt();
                    Matrix matrix4 = new Matrix(rows4,cols4);
                    System.out.println("Nhập giá trị :");
                    matrix4.input();
                    
                    System.out.println("Tích hai ma trận :");
                    matrix3.sub(matrix4).print();
                    break;
                case 3:
                    System.out.println("Mời nhập ma trận 1 :");
                    System.out.println("Nhập số hàng :");
                    int rows = scanner.nextInt();
                    System.out.println("Nhập số cột :");
                    int cols = scanner.nextInt();
                    Matrix matrix = new Matrix(rows,cols);
                    System.out.println("Nhập giá trị :");
                    matrix.input();
                    System.out.println("Ma trận chuyển vị : ");
                    matrix.transpose().print();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chức năng hiện chưa có . Vui lòng chọn lại");
                    break;
            }
        }
      
        
    }
}
