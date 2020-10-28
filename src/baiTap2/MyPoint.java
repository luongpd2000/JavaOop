/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTap2;

/**
 *
 * @author DELL
 */
public class MyPoint {
    private double x;
    private double y;

    public MyPoint() {
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
     public MyPoint(MyPoint p) {
        this.x = p.getX();
        this.y = p.getY();
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public double distance(MyPoint secondPoint){
        return Math.sqrt(Math.pow((this.x-secondPoint.getX()), 2)+Math.pow((this.y-secondPoint.getY()), 2));
    }
     
    public static double distance(MyPoint p1,MyPoint p2){
        return Math.sqrt(Math.pow((p1.getX()-p2.getX()), 2)+Math.pow((p1.getY()-p2.getY()), 2));
    }
    
}
