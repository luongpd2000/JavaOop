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
public class StackOfChar {
    
    private char[] elements;
    private int size;

    public StackOfChar() {
        this.elements = new char[16];
    }

    public StackOfChar(int capacity) {
        this.elements = new char[capacity];
    }
    
    public boolean isEmpty(){
        return this.size==0 ;
    }
    
    public boolean isFull(){
        return elements.length==size;
    }
    
    public char peak() {
        return elements[size-1];
    }
    
    public void push(char ch){
        this.size++;
        elements[size-1]=ch;
    }
    
    public char pop(){
        this.size--;
        return elements[size];
    }

    public int getSize() {
        return size;
    }
}
