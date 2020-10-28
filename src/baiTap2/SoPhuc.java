/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTap2;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author DELL
 */
public class SoPhuc {
    private float a;
    private float b;

    public SoPhuc() {
    }

    public SoPhuc(float a, float b) {
        this.a = a;
        this.b = b;
    }
    
    public SoPhuc cong(SoPhuc sp2){
        float thuc = this.a + sp2.a;
        float ao = this.b + sp2.b;
        
        return new SoPhuc(thuc, ao);
    }
    
    public SoPhuc tru(SoPhuc sp2){
        float thuc = this.a - sp2.a;
        float ao = this.b - sp2.b;
        
        return new SoPhuc(thuc, ao);
    }
    
    public SoPhuc nhan(SoPhuc sp2){
        float thuc = (this.a*sp2.a) - (this.b*sp2.b);
        float ao = (this.a*sp2.b) + (this.b*sp2.a);
        
        return new SoPhuc(thuc, ao);
    }
    
    public SoPhuc chia(SoPhuc sp2){
        float thuc = (float) (((this.a*sp2.a)+(this.b*sp2.b))/(Math.pow(sp2.a, 2)+Math.pow(sp2.b, 2)));
        float ao = (float) (((sp2.a*this.b) - (sp2.b*this.a))/(Math.pow(sp2.a, 2)+Math.pow(sp2.b, 2)));
        
        return new SoPhuc(thuc, ao);
    }
    
    public SoPhuc nghichDao(){
        float x=a/(float)((float)Math.pow(a,2)+(float)Math.pow(b,2));
        float y=(-b)/(float)((float)Math.pow(a,2)+(float)Math.pow(b,2));
        return new SoPhuc(x,y);
    }
    public boolean bangNhau(SoPhuc sp2){
        return (this.a==sp2.a&&this.b==sp2.b);
    }
    public boolean lonHon(SoPhuc sp2){
        return (Math.sqrt(Math.pow(a,2)+Math.pow(b,2))>Math.sqrt(Math.pow(sp2.a,2)+Math.pow(sp2.b,2)));
    }
    public boolean nhoHon(SoPhuc sp2){
        return (Math.sqrt(Math.pow(a,2)+Math.pow(b,2))<Math.sqrt(Math.pow(sp2.a,2)+Math.pow(sp2.b,2)));
    }
    public void hien(){
        System.out.println(this.a+"+"+this.b+"j");
    }
    public void nhap(){
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        String S[]=s.split("\\+j");
        this.a=Float.parseFloat(S[0]);
        this.b=Float.parseFloat(S[1]);
    }
    
}
