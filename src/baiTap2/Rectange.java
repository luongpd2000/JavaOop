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
public class Rectange {
    private double width;
    private double height;
    private String color;

    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public Rectange() {
        this.width=1.0;
        this.height=1.0;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Rectange{" + "width=" + width + ", height=" + height + ", color : " + color + '}';
    }
    
    
    
    public double findArea(){
        return this.height*this.width;
    }
    
    public double findPerimeter(){
        return (this.height+this.width)*2;
    }
    
}
