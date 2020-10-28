/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTap2;

import java.util.Stack;

/**
 *
 * @author DELL
 */
public class StackOfIntergers {
    private int[] elements;
    private int size;

    public StackOfIntergers() {
        this.elements = new int[16];
    }

    public StackOfIntergers(int capacity) {
        this.elements = new int[capacity];
    }
    
    public boolean isEmpty(){
        return this.size==0 ;
    }
    
    public boolean isFull(){
        return elements.length==size;
    }
    
    public int peak() {
        return elements[size-1];
    }
    
    public void push(int value){
        this.size++;
        elements[size-1]=value;
    }
    
    public int pop(){
        this.size--;
        return elements[size];
    }

    public int getSize() {
        return size;
    }
    
}
